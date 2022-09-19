package com.user.myapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.user.myapp.entity.User;

@Primary
@Repository("userDAOHib")
public class UserDAOHib implements IUserDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public User getUserById(int id) {
		Session session = sessionFactory.openSession();
		return session.get(User.class, id);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
