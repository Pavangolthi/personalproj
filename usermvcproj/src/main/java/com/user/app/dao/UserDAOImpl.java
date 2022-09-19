package com.user.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.user.app.model.User;

@Repository("userDAO")
public class UserDAOImpl implements IUserDAO{
	
	private String selectQuery = "select * from test.user where id=?";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private RowMapper<User> userRowMapper;

	@Override
	public User getUserById(int id) {
		User user = jdbcTemplate.queryForObject(selectQuery, userRowMapper, id);
		return user;
	}

}
