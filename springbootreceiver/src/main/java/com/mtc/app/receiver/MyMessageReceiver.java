package com.mtc.app.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.mtc.app.model.Order;

@Component
public class MyMessageReceiver {
	
//	@RabbitListener(queues= {"JanQueue"})
//	public void getCustomMessage(String msg) {
//		System.out.println(msg);
//	}
	
	@RabbitListener(queues= {"OrderQueue"})
	public void getOrder(Order order) {
		System.out.println(order);
	}
}
