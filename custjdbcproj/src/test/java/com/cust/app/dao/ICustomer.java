package com.cust.app.dao;

import java.util.List;

import com.cust.app.model.Customer;

public interface ICustomer {
	public Customer getById(int id);
	public int addUser(Customer customer);
	public List<Customer> allUsers();
}
