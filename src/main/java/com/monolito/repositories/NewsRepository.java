package com.monolito.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.monolito.models.News;


public interface NewsRepository extends MongoRepository<News, String> {
}
