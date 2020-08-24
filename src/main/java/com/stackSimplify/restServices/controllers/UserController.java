package com.stackSimplify.restServices.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stackSimplify.restServices.entities.User;
import com.stackSimplify.restServices.services.UserService;

@RestController
public class UserController {

	//Autowire the user service
	@Autowired
	 UserService userservice;
	
	//add user to DB
	@PostMapping("/adduser")
	public User adduser(@RequestBody User user) {
		return userservice.saveuser(user);
		}
	
	//get all users from db
	@GetMapping("/findalluser")
	public List<User> findallUsers(){
		return userservice.getUsers();
	}
		
	// get user by id from db 
	@GetMapping("/findbyid/{id}")
	public User getuserById(@PathVariable long id) {
		return userservice.getUserById(id);
		}
	
	//delete user by id
	@DeleteMapping("/deleteUserbyId/{id}")	
	public void deleteUserById(@PathVariable long id) {		
		userservice.deleteUserById(id);				
	}
	
	//update user by id
	@PutMapping("/updateUserbyId/{id}")
		public User updateUserById(@PathVariable long id, @RequestBody User user) {
			return userservice.updateUserbyId(id, user);
			
		}
	
	//get User by username
	@GetMapping("/getusername/{username}")
	public User getUserName(@PathVariable String username) {
		return userservice.getUserByUsername(username);
	}
}
