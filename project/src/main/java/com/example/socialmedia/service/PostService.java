package com.example.socialmedia.service;

import com.example.socialmedia.model.sql.Post;
import com.example.socialmedia.repository.sql.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepo;

    public List<Post> getAll() {
        return postRepo.findAll();
    }

    public Post getById(Long id) {
        return postRepo.findById(id).orElse(null);
    }

    public Post create(Post post) {
        return postRepo.save(post);
    }

    public void delete(Long id) {
        postRepo.deleteById(id);
    }
}
