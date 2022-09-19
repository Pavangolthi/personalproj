package com.mtc.app.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mtc.app.entity.Customer;

@FeignClient(name="customerservice")
public interface ICustomerProxy {
	
	@GetMapping("/customer/{id}")
	public Customer findCustomer(@PathVariable("id")int id);
}
