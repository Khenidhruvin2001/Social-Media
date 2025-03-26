package com.example.socialmedia.service;

import com.example.socialmedia.model.nosql.Like;
import com.example.socialmedia.repository.nosql.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LikeService {

    @Autowired
    private LikeRepository likeRepository;

    public Like likePost(Like like) {
        return likeRepository.save(like);
    }

    public void unlikePost(Long postId, Long userId) {
        List<Like> likes = likeRepository.findByPostId(postId);
        for (Like like : likes) {
            if (like.getUserId().equals(userId)) {
                likeRepository.delete(like);
                return;
            }
        }
        throw new RuntimeException("Like not found for postId: " + postId + " and userId: " + userId);
    }

    public List<Like> getLikesByPost(Long postId) {
        return likeRepository.findByPostId(postId);
    }

    public List<Like> getLikesByUser(Long userId) {
        return likeRepository.findByUserId(userId);
    }

    public List<Like> getAllLikes() {
        return likeRepository.findAll();
    }

}
