package com.mtc.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mtc.app.mapper.UserMapper;
import com.mtc.app.model.User;

@RestController
@RequestMapping("/users")
public class UserRestController {
	
	@Autowired
	private UserMapper userMapper;
	
	
	@GetMapping("/all")
	public List<User> findAll(){
		return userMapper.getUsers();
	}
	
	@GetMapping("/insert")
	public List<User> update(){
		User user = new User();
		user.setName("Shiva");
		user.setUsername("shiva kumar");
		
		userMapper.update(user);
		
		return userMapper.getUsers();
	}
}
