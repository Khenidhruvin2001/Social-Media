package com.example.socialmedia.service;

import com.example.socialmedia.exception.NotFoundException;
import com.example.socialmedia.model.sql.Follow;
import com.example.socialmedia.model.sql.User;
import com.example.socialmedia.repository.sql.FollowRepository;
import com.example.socialmedia.repository.sql.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FollowService {

    @Autowired
    private FollowRepository followRepository;

    @Autowired
    private UserRepository userRepository;

    public Follow followUser(Long followerId, Long followingId) {
        System.out.println("Follower: " + followerId + ", Following: " + followingId);

        if (followerId == null || followingId == null) {
            throw new IllegalArgumentException("Follower ID and Following ID must not be null.");
        }

        if (followerId.equals(followingId)) {
            throw new IllegalArgumentException("You cannot follow yourself.");
        }

        User follower = userRepository.findById(followerId)
                .orElseThrow(() -> new RuntimeException("Follower not found with ID: " + followerId));

        User following = userRepository.findById(followingId)
                .orElseThrow(() -> new RuntimeException("User to follow not found with ID: " + followingId));

        Optional<Follow> existingFollow = followRepository.findByFollowerAndFollowing(follower, following);
        if (existingFollow.isPresent()) {
            throw new IllegalArgumentException("You are already following this user.");
        }

        Follow follow = new Follow();
        follow.setFollower(follower);
        follow.setFollowing(following);

        return followRepository.save(follow);
    }

    public void unfollowUser(Long followerId, Long followingId) {
        if (followerId == null || followingId == null) {
            throw new NotFoundException("Follower or Following ID is missing");
        }

        User follower = userRepository.findById(followerId)
                .orElseThrow(() -> new NotFoundException("Follower user not found"));
        User following = userRepository.findById(followingId)
                .orElseThrow(() -> new NotFoundException("Following user not found"));

        Follow existing = followRepository.findByFollowerAndFollowing(follower, following)
                .orElseThrow(() -> new NotFoundException("You are not following this user"));

        followRepository.delete(existing);
    }


    public List<Follow> getAllFollows() {
        return followRepository.findAll();
    }

    public List<Follow> getFollowing(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return followRepository.findByFollower(user);
    }

}
