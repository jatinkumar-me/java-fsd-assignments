package com.jatin.user_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jatin.user_project.entity.User;
import com.jatin.user_project.service.UserService;

/**
 * UserController
 */
@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/login")
	public void login(@RequestBody UserLoginDTO userLoginDTO) {
		userService.login(userLoginDTO.getEmailId(), userLoginDTO.getPassword());
	}

	@PostMapping("/register")
	public void register(@RequestBody User  newUser) {
		userService.registerUser(newUser);
	}

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("user/{id}") 
	public User getUser(@PathVariable("id") int id) {
		return userService.getUserById(id);
	}

	@DeleteMapping("/user/{id}")
	public void deleteEmployee(@PathVariable("id") int id, @RequestBody String password) {
		userService.deleteUserById(id, password);
	}

	@PutMapping("/user/{id}")
	public void updateUser(@PathVariable("id") int id, @RequestBody User user) {
		userService.updateUser(id, user);
	}
}
