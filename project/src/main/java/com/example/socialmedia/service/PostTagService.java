package com.example.socialmedia.service;

import com.example.socialmedia.model.sql.PostTag;
import com.example.socialmedia.repository.sql.PostTagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class PostTagService {

    @Autowired
    private PostTagRepository postTagRepo;

    public List<PostTag> getAll() {
        return postTagRepo.findAll();
    }

    public PostTag create(PostTag postTag) {
        return postTagRepo.save(postTag);
    }

    public void delete(Long id) {
        postTagRepo.deleteById(id);
    }
}
