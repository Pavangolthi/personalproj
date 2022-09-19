package com.user.myapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.user.myapp.entity.User;


@Repository("userDAO")
public class UserDAOImpl{
	
	private String selectQuery = "select * from test.user where id=?";
	private String selectAll = "select * from test.user";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
//	@Autowired
//	private RowMapper<User> userRowMapper;
//
//	@Override
//	public User getUserById(int id) {
//		User user = jdbcTemplate.queryForObject(selectQuery, userRowMapper, id);
//		return user;
//	}
//
//	@Override
//	public List<User> getAllUsers() {
//		List<User> userList = jdbcTemplate.query(selectAll, userRowMapper);
//		return userList;
//	}

}
