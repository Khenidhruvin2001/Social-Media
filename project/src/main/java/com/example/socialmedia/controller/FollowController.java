package com.example.socialmedia.controller;

import com.example.socialmedia.model.sql.Follow;
import com.example.socialmedia.service.FollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/follows")
public class FollowController {

    @Autowired
    private FollowService followService;

    @PostMapping("/follow")
    public ResponseEntity<?> follow(@RequestBody Map<String, Long> request) {
        try {
            Long followerId = request.get("followerId");
            Long followingId = request.get("followingId");
            Follow follow = followService.followUser(followerId, followingId);
            return new ResponseEntity<>(follow, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace(); // 🔍 See backend logs
            return ResponseEntity.status(400).body("Follow failed: " + e.getMessage());
        }
    }

    @PostMapping("/unfollow")
    public ResponseEntity<Void> unfollow(@RequestBody Map<String, Long> request) {
        Long followerId = request.get("followerId");
        Long followingId = request.get("followingId");
        followService.unfollowUser(followerId, followingId);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Follow>> getFollowingByUser(@PathVariable Long userId) {
        List<Follow> followings = followService.getFollowing(userId);
        return ResponseEntity.ok(followings);
    }
}
