package com.user.myapp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.myapp.dao.IUserDAO;
import com.user.myapp.entity.User;

@RequestMapping("/users")
@RestController
public class UserRestController {
	
	@Autowired
	private IUserDAO userDAO;
	
	@GetMapping(path="/{id}", produces="application/xml")
	public User findById(@PathVariable("id") int id) {
		return userDAO.getUserById(id);
	}
}
