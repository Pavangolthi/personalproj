package com.mtc.app.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mtc.app.entity.Customer;
import com.mtc.app.repository.ICustomerRepository;

@RequestMapping("/customer")
@RestController
public class CustomerRestController {
	
	@Autowired
	ICustomerRepository customerRepository;
	
	@GetMapping(path="/{id}",produces="application/json")
	public Customer findById(@PathVariable("id")int id) {
		Customer customer =  customerRepository.findById(id).get();
		System.out.println(customer);
		return customer;
	}
}
