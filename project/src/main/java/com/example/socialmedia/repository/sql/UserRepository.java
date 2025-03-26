package com.example.socialmedia.repository.sql;

import com.example.socialmedia.model.sql.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
