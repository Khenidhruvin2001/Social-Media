package com.example.socialmedia.controller;

import com.example.socialmedia.model.nosql.Like;
import com.example.socialmedia.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/likes")
public class LikeController {

    @Autowired
    private LikeService likeService;

    @PostMapping
    public Like like(@RequestBody Like like) {
        return likeService.likePost(like);
    }

    @DeleteMapping
    public void unlike(@RequestParam Long postId, @RequestParam Long userId) {
        likeService.unlikePost(postId, userId);
    }

    @GetMapping("/post/{postId}")
    public List<Like> getLikesByPost(@PathVariable Long postId) {
        return likeService.getLikesByPost(postId);
    }

    @GetMapping("/user/{userId}")
    public List<Like> getLikesByUser(@PathVariable Long userId) {
        return likeService.getLikesByUser(userId);
    }

    @GetMapping
    public List<Like> getAllLikes() {
        return likeService.getAllLikes();
    }

}
