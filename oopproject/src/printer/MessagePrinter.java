package printer;

public class MessagePrinter {
	
	FileMessageProvider fileMessageProvider;
	DBMessageProvider dbMessageProvider;
	NewDBMessageProvider newDBMessageProvider;
	
	public MessagePrinter() {
		fileMessageProvider = new FileMessageProvider();
		dbMessageProvider =  new DBMessageProvider();
		newDBMessageProvider = new NewDBMessageProvider();
	}
	
	public void printMessage(String source) {
		
		switch (source) {
		case "file":
			System.out.println(fileMessageProvider.fetchFileMessage());
			break;
		case "db":
			System.out.println(dbMessageProvider.fetchDBMessage());
			break;
		case "newdb":
			System.out.println(newDBMessageProvider.fetchNewDBMessage());
			break;
		default:
			System.out.println("Invalid");
		}
	}
}
