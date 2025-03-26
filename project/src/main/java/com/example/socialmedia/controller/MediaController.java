package com.example.socialmedia.controller;

import com.example.socialmedia.model.sql.Media;
import com.example.socialmedia.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/media")
public class MediaController {
    @Autowired
    private MediaService service;

    @GetMapping
    public List<Media> getAll() { return service.getAll(); }

    @PostMapping
    public Media create(@RequestBody Media media) { return service.create(media); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}
