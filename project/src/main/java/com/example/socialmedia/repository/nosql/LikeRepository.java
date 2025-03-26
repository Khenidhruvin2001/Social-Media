package com.example.socialmedia.repository.nosql;

import com.example.socialmedia.model.nosql.Like;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface LikeRepository extends MongoRepository<Like, String> {
    List<Like> findByPostId(Long postId);
    List<Like> findByUserId(Long userId);
    void deleteByPostIdAndUserId(Long postId, Long userId);
}
