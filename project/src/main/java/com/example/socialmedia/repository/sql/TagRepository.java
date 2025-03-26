package com.example.socialmedia.repository.sql;

import com.example.socialmedia.model.sql.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {}
