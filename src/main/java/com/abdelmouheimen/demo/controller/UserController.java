package com.abdelmouheimen.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abdelmouheimen.demo.entities.User;
import com.abdelmouheimen.demo.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@GetMapping("test")
	public List<User> getUsers(){
		return userRepository.findByFirstName("abdel");
	}
	
}
