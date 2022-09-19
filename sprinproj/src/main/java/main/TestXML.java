package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mtc.app.printer.MessagePrinter;

public class TestXML {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/META-INF/spring/app-context.xml");
		
		MessagePrinter messagePrinter = applicationContext.getBean(MessagePrinter.class);
		
		messagePrinter.printMessage();
		
	}
}
