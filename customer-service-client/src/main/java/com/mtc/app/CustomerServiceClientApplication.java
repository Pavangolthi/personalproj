package com.mtc.app;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.mtc.app.entity.Customer;
import com.mtc.app.proxy.ICustomerProxy;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class CustomerServiceClientApplication implements CommandLineRunner{
	
	@Autowired
	private ICustomerProxy customerProxy;

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Customer customer = customerProxy.findCustomer(1);
		System.out.println(customer);
	}

}
