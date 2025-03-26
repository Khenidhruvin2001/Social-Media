package com.example.socialmedia.repository.sql;

import com.example.socialmedia.model.sql.Media;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MediaRepository extends JpaRepository<Media, Long> {}
