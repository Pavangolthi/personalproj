package com.mtc.app.provider;

import org.springframework.stereotype.Component;

@Component("fileMessageProvider")
public class FileMessageProvider implements IMessageProvider{

	@Override
	public String fetchMessage() {
		// TODO Auto-generated method stub
		return "File: Welcome to Spring Framework";
	}
	
}
