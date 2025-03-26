package com.example.socialmedia.service;

import com.example.socialmedia.model.nosql.Notification;
import com.example.socialmedia.repository.nosql.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {
    @Autowired
    private NotificationRepository repo;

    public Notification create(Notification notification) {
        return repo.save(notification);
    }

    public List<Notification> getByUser(Long userId) {
        return repo.findByUserId(userId);
    }

    public void markAsRead(String id) {
        Notification n = repo.findById(id).orElseThrow();
        n.setRead(true);
        repo.save(n);
    }
}