package com.example.socialmedia.controller;

import com.example.socialmedia.model.sql.Post;
import com.example.socialmedia.model.sql.User;
import com.example.socialmedia.repository.sql.UserRepository;
import com.example.socialmedia.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    @Autowired
    private PostService service;
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<Post> getAll() { return service.getAll(); }

    @PostMapping
    public Post create(@RequestBody Map<String, Object> payload) {
        try {
            if (!payload.containsKey("userId") || payload.get("userId") == null)
                throw new RuntimeException("userId is required");

            String content = (String) payload.get("content");
            Long userId = Long.parseLong(payload.get("userId").toString());

            System.out.println("Creating post for userId: " + userId);

            User user = userRepository.findById(userId)
                    .orElseThrow(() -> new RuntimeException("User not found with ID: " + userId));

            Post post = new Post();
            post.setContent(content);
            post.setUser(user);

            return service.create(post);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
