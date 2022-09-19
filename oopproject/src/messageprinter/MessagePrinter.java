package messageprinter;

public class MessagePrinter {
	
	private IMessageProvider iMessageProvider;
	
	public MessagePrinter() {
	}
	
	public void printMessage() {
		System.out.println(iMessageProvider.fetchMessage());
		System.out.println(iMessageProvider.filterMessage("Hello"));
	}
	public void setiMessageProvider(IMessageProvider iMessageProvider) {
		this.iMessageProvider = iMessageProvider;
	}
}
