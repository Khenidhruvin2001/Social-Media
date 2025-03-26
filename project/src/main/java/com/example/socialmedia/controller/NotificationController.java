package com.example.socialmedia.controller;

import com.example.socialmedia.model.nosql.Notification;
import com.example.socialmedia.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    @Autowired
    private NotificationService service;

    @PostMapping
    public Notification create(@RequestBody Notification notification) {
        return service.create(notification);
    }

    @GetMapping("/user/{userId}")
    public List<Notification> getUserNotifications(@PathVariable Long userId) {
        return service.getByUser(userId);
    }

    @PutMapping("/read/{id}")
    public void markRead(@PathVariable String id) {
        service.markAsRead(id);
    }
}
