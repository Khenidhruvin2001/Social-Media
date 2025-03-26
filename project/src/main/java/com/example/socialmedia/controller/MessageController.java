package com.example.socialmedia.controller;

import com.example.socialmedia.model.nosql.Message;
import com.example.socialmedia.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @Autowired
    private MessageService service;

    @PostMapping
    public Message send(@RequestBody Message message) {
        return service.send(message);
    }

    @GetMapping("/user/{userId}")
    public List<Message> getConversation(@PathVariable Long userId) {
        return service.getConversation(userId);
    }
}
