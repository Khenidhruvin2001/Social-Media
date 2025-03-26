package com.example.socialmedia.controller;

import com.example.socialmedia.model.sql.PostTag;
import com.example.socialmedia.service.PostTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/post-tags")
public class PostTagController {
    @Autowired
    private PostTagService service;

    @GetMapping
    public List<PostTag> getAll() { return service.getAll(); }

    @PostMapping
    public PostTag create(@RequestBody PostTag postTag) { return service.create(postTag); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}
