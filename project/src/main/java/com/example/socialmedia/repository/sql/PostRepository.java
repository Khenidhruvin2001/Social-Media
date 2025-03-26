package com.example.socialmedia.repository.sql;

import com.example.socialmedia.model.sql.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
