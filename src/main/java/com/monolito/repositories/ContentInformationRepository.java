package com.monolito.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.monolito.models.ContentInformation;
public interface ContentInformationRepository extends MongoRepository<ContentInformation, String> {

}