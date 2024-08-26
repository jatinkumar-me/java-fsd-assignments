package com.jatin.crud_reactive.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.stereotype.Repository;

import com.jatin.crud_reactive.model.User;

import reactor.core.publisher.Flux;

/**
 * UserRepository
 */
@Repository
@EnableReactiveMongoRepositories
public interface UserRepository extends ReactiveMongoRepository<User, String> {

	Flux<User> findByFirstName(String firstName);
	Flux<User> findByLastName(String lastName);
}
