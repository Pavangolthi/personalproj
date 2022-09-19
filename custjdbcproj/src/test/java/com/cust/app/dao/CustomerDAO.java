package com.cust.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cust.app.model.Customer;

@Repository("customerDAO")
public class CustomerDAO implements ICustomer{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private RowMapper<Customer> customerRowMapper;
	
	private String selectQuery = "select * from test.user where id = ?";
	private String insertQuery = "insert into test.user(id,name,username) values (?,?,?)";
	private String selectAllQuery = "select * from test.user";

	@Override
	public Customer getById(int id) {
		return jdbcTemplate.queryForObject(selectQuery, customerRowMapper, id);
	}

	@Override
	public int addUser(Customer customer) {
		int noOfRows = jdbcTemplate.update(insertQuery, customer.getId(),customer.getName(),customer.getUserName());
		
		return noOfRows;
	}

	@Override
	public List<Customer> allUsers() {
		return jdbcTemplate.query(selectAllQuery, customerRowMapper);
	}
	

}
