package com.example.socialmedia.service;

import com.example.socialmedia.model.sql.User;
import com.example.socialmedia.repository.sql.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;

    public List<User> getAll() {
        return userRepo.findAll();
    }

    public Optional<User> getById(Long id) {
        return userRepo.findById(id);
    }

    public User create(User user) {
        return userRepo.save(user);
    }

    public User update(Long id, User updated) {
        return userRepo.findById(id).map(user -> {
            user.setName(updated.getName());
            user.setEmail(updated.getEmail());
            user.setPassword(updated.getPassword());
            return userRepo.save(user);
        }).orElse(null);
    }

    public void delete(Long id) {
        userRepo.deleteById(id);
    }
}
