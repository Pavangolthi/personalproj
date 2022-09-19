package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mtc.app.ExampleService;
import com.mtc.app.printer.MessagePrinter;

public class Test {

	public static void main(String[] args) {
		
		// The following statement loads the Spring IOC Container.
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.mtc.app");
		
		MessagePrinter messagePrinter = applicationContext.getBean(MessagePrinter.class);		
	
		messagePrinter.printMessage();
	}

}
