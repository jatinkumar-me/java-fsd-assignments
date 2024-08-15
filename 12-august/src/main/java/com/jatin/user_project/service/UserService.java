package com.jatin.user_project.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.jatin.user_project.entity.User;
import com.jatin.user_project.repository.UserRepository;

/**
 * UserService
 */
@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	/**
	 * @param id
	 * @return
	 */
	public User getUserById(int id) {
		Optional<User> user = userRepository.findById(id);

		if (user.isPresent()) {
			user.get().setPassword(null);
			return user.get();
		}

		return null;
	}

	/**
	 * @return
	 */
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<>();
		userRepository.findAll().forEach(user -> users.add(user));
		users.forEach((user) -> user.setPassword(null));

		return users;
	}

	/**
	 * @param user
	 */
	public void registerUser(User user) {
		if (userRepository.existsByEmailId(user.getEmailId())) {
			throw new IllegalArgumentException("Email already exists");
		}
		userRepository.save(user);
	}

	/**
	 * @param email
	 * @param password
	 * @return
	 */
	public boolean login(String email, String password) {
		User user = userRepository.findByEmailId(email);
		if (user == null) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not exists");
		}
		return user != null && user.getPassword().equals(password);
	}

	/**
	 * @param id
	 * @param password
	 */
	public void deleteUserById(int id, String password) {
		User user = userRepository.findById(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));
		if (!password.equals(user.getPassword())) {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Wrong password");
		}
		userRepository.deleteById(id);
	}

	public void updateUser(int id, User user) {
		User repoUser = userRepository.findById(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));

		if (!repoUser.getPassword().equals(user.getPassword())) {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Wrong password");
		}
		if (user.getPassword() != null) {
			repoUser.setPassword(user.getPassword());
		}
		if (user.getFirstName() != null) {
			repoUser.setFirstName(user.getFirstName());
		}
		if (user.getLastName() != null) {
			repoUser.setLastName(user.getLastName());
		}
		if (user.getMobile() != null) {
			repoUser.setMobile(user.getMobile());
		}
		userRepository.save(repoUser);
	}
}
