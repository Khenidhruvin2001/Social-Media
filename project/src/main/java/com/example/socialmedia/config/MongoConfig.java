package com.example.socialmedia.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(
    basePackages = "com.example.socialmedia.repository.nosql"  // Only MongoDB repos here
)
public class MongoConfig {
}
