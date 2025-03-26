package com.example.socialmedia.repository.nosql;

import com.example.socialmedia.model.nosql.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MessageRepository extends MongoRepository<Message, String> {
    List<Message> findByReceiverIdOrSenderId(Long receiverId, Long senderId);
}
