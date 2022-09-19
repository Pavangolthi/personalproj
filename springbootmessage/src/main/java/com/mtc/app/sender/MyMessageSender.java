package com.mtc.app.sender;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MyMessageSender {
	
	@Autowired
	private RabbitMessagingTemplate messagingTemplate;
	
	@Bean
	public Queue getQueue() {
		return new Queue("JanQueue", false);
	}
	
	public void sendCustomMessage(String message) {
		messagingTemplate.convertAndSend("JanQueue", message);
		System.out.println("Message Sent");
	}
}
