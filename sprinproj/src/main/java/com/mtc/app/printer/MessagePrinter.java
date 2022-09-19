package com.mtc.app.printer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mtc.app.provider.FileMessageProvider;
import com.mtc.app.provider.IMessageProvider;

@Scope("prototype")
@Component("messagePrinter")
public class MessagePrinter {
	
	@Qualifier("fileMessageProvider")
	@Autowired
	private IMessageProvider messageProvider;
	
	public MessagePrinter() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * public MessagePrinter(IMessageProvider messageProvider) { super();
	 * this.messageProvider = messageProvider; }
	 */

	public void printMessage() {
		System.out.println(messageProvider.fetchMessage());
	}
	
	
	  public void setMessageProvider(IMessageProvider messageProvider) {
	  this.messageProvider = messageProvider; }
	 
}
