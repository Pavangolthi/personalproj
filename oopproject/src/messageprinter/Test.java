package messageprinter;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		MessagePrinter messagePrinter = new MessagePrinter();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the source name: ");
		String source = scanner.next();
		
		switch (source) {
		case "file":
			FileMessageProvider fileMessageProvider = new FileMessageProvider();
			messagePrinter.setiMessageProvider(fileMessageProvider);
			messagePrinter.printMessage();
			break;
		case "db":
			DBMessageProvider dbMessageProvider = new DBMessageProvider();
			messagePrinter.setiMessageProvider(dbMessageProvider);
			messagePrinter.printMessage();
			break;
		default:
			System.out.println("Invalid source");
		}
		scanner.close();
	}

}
