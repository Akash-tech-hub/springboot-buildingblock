package com.stackSimplify.restServices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller 
@RestController 
public class HelloWorldController {

	//Simple method 
	//since we are using @RestController , we need two thing 
	//1. URI - say as "/helloworld"
	//2. http methods : ie. Get 
	
	//@RequestMapping(method = RequestMethod.GET, path = "/helloworld")
	@GetMapping("/helloworld2")
	public String helloWorld() {
		return "Hello World";
		
	}
	@GetMapping("/hello-world-bean")
	public UserDetails helloWorldBean() {
		return new UserDetails ("Akash", "Mazumdar", "Kolkata");
	}
}
