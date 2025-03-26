package com.example.socialmedia.repository.sql;

import com.example.socialmedia.model.sql.PostTag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostTagRepository extends JpaRepository<PostTag, Long> {}
