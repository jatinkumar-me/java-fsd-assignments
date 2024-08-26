package com.jatin.crud_reactive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jatin.crud_reactive.model.User;
import com.jatin.crud_reactive.repository.UserRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * UserService
 */
@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public Flux<User> getAllUsers() {
		return userRepository.findAll();
	}

	public Mono<User> getUserById(String id) {
		return userRepository.findById(id);
	}

	public Mono<User> createUser(User user) {
		return userRepository.save(user);
	}

	public Mono<User> updateUser(String id, User user) {
		return userRepository.findById(id)
				.flatMap(existingUser -> {
					existingUser.setFirstName(user.getFirstName());
					existingUser.setLastName(user.getLastName());
					existingUser.setMobile(user.getMobile());
					existingUser.setEmailId(user.getEmailId());
					return userRepository.save(existingUser);
				});
	}

	public Mono<Void> deleteUser(String id) {
		return userRepository.deleteById(id);
	}
}
