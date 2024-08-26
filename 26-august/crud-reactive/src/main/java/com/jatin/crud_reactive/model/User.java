package com.jatin.crud_reactive.model;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * User
 */
@Data
@AllArgsConstructor
public class User {

	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private String mobile;
}
