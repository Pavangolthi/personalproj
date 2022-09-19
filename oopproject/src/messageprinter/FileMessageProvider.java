package messageprinter;
/**
 * 
 * @author Person A
 *
 */
public class FileMessageProvider implements IMessageProvider{

	@Override
	public String fetchMessage() {
		System.out.println("***fetchFileMessage()***");
		return "Welcome to the world of interface";
	}

}
