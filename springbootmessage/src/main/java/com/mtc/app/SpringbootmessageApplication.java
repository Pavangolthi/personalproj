package com.mtc.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mtc.app.model.Order;
import com.mtc.app.sender.MyMessageSender;
import com.mtc.app.sender.MyOrderSender;

@SpringBootApplication
public class SpringbootmessageApplication implements CommandLineRunner{
	
	@Autowired
	private MyMessageSender messageSender;
	
	@Autowired
	private MyOrderSender myOrderSender;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootmessageApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//messageSender.sendCustomMessage("Welcome to Enterprise Messaging");
		myOrderSender.sendOrder(new Order(101, 300, "Urgent Requirement", 50));
	}

}
