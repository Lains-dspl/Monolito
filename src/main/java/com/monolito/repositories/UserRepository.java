package com.monolito.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.monolito.models.UserInformation;
public interface UserRepository extends MongoRepository<UserInformation, String> {

	@Query(value = "{ 'accountInformation.username' : ?0}")
	UserInformation findByProfileUsername(String username);

	@Query(value = "{ 'profileInformation.role' : ?0}")
	List<UserInformation> findByRole(String role);
}