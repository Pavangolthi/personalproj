package com.mtc.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




/**
 * {@link Service} with hard-coded input data.
 */
@Component
public class ExampleService implements Service {
	
	//For injecting dependency
	@Autowired
	//private IMessageProvider messageProvider;
	
	
	public String getMessage() {
		//return "Hello world!";
		//return messageProvider.fetchMessage();
		return null;
	}

}
