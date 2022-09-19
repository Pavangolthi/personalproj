package com.mtc.app.provider;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component("dbMessageProvider")
public class DBMessageProvider implements IMessageProvider{

	@Override
	public String fetchMessage() {
		// TODO Auto-generated method stub
		return "DB: Spring Framework is an application framework";
	}

}
