package com.example.socialmedia.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(
    basePackages = "com.example.socialmedia.repository.sql"  // Only JPA repos here
)
public class JpaConfig {
}
