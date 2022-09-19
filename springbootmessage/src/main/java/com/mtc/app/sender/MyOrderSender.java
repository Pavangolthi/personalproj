package com.mtc.app.sender;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.mtc.app.model.Order;

@Component
public class MyOrderSender {
	
	@Autowired
	private RabbitMessagingTemplate messageTemp;
	
	@Bean
	public Queue getQueues() {
		return new Queue("OrderQueue", false);
	}
	
	public void sendOrder(Order order) {
		messageTemp.convertAndSend("OrderQueue", order);
	}
	
	
}
