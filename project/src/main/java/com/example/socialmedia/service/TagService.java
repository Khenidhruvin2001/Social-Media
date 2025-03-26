package com.example.socialmedia.service;

import com.example.socialmedia.model.sql.Tag;
import com.example.socialmedia.repository.sql.TagRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

@Service
public class TagService {

    @Autowired
    private TagRepository tagRepo;

    public List<Tag> getAll() {
        return tagRepo.findAll();
    }

    public Tag create(Tag tag) {
        return tagRepo.save(tag);
    }

    public void delete(Long id) {
        tagRepo.deleteById(id);
    }
}
