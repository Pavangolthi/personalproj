package com.user.myapp.dao;

import java.util.List;

import com.user.myapp.entity.User;

public interface IUserDAO {
	public User getUserById(int id);
	
	public List<User> getAllUsers();
}
