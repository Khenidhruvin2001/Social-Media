package com.example.socialmedia.service;

import com.example.socialmedia.model.nosql.Message;
import com.example.socialmedia.repository.nosql.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessageRepository repo;

    public Message send(Message message) {
        return repo.save(message);
    }

    public List<Message> getConversation(Long userId) {
        return repo.findByReceiverIdOrSenderId(userId, userId);
    }
}
