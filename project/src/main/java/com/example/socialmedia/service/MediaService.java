package com.example.socialmedia.service;

import com.example.socialmedia.model.sql.Media;
import com.example.socialmedia.repository.sql.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MediaService {

    @Autowired
    private MediaRepository mediaRepo;

    public List<Media> getAll() {
        return mediaRepo.findAll();
    }

    public Media create(Media media) {
        return mediaRepo.save(media);
    }

    public void delete(Long id) {
        mediaRepo.deleteById(id);
    }
}
