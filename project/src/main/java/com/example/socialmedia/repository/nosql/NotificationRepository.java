package com.example.socialmedia.repository.nosql;

import com.example.socialmedia.model.nosql.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface NotificationRepository extends MongoRepository<Notification, String> {
    List<Notification> findByUserId(Long userId);
}
