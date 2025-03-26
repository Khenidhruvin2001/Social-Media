package com.example.socialmedia.repository.nosql;

import com.example.socialmedia.model.nosql.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CommentRepository extends MongoRepository<Comment, String> {
    List<Comment> findByPostId(Long postId);
}
