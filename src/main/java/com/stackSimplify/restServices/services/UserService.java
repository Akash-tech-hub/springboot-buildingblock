package com.stackSimplify.restServices.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackSimplify.restServices.entities.User;
import com.stackSimplify.restServices.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	 UserRepository userrepository;

	//Add user service
	public User saveuser(User user) {
		return userrepository.save(user);
	}
	
	// get all users service 
	public List<User> getUsers(){
		return userrepository.findAll();
	}
	
	// get user by id service 
	public User getUserById(long id) {
		return userrepository.findById(id).orElse(null);
	}
	
	//delete user by id service	
	public void deleteUserById(long id) {
		
		if(userrepository.findById(id).isPresent()) 
			userrepository.deleteById(id);
			
	}
	
	//update user by id
	public User updateUserbyId( long id,User user) {		
		user.setId(id);
		return userrepository.save(user);
	}
	
	//get user by username
	public User getUserByUsername(String username){
		return userrepository.findByUsername(username);
		
	}
	
}
