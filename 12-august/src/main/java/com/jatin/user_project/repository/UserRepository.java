package com.jatin.user_project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jatin.user_project.entity.User;

/**
 * UserRepository
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	/**
	 * @param emailId
	 * @return
	 */
	boolean existsByEmailId(String emailId);

    /**
     * @param email
     * @return
     */
    User findByEmailId(String email);
}
