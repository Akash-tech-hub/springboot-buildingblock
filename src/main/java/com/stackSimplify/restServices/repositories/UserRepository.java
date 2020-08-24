package com.stackSimplify.restServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stackSimplify.restServices.entities.User;

//Repository for storing data or say it as a dao layer 
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByUsername(String username);
	
}
