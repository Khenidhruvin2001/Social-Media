package com.example.socialmedia.controller;

import com.example.socialmedia.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.socialmedia.model.sql.Tag;

@RestController
@RequestMapping("/api/tags")
public class TagController {
    @Autowired
    private TagService service;

    @GetMapping
    public List<Tag> getAll() { return service.getAll(); }

    @PostMapping
    public Tag create(@RequestBody Tag tag) { return service.create(tag); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}
