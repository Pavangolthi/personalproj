package messageprinter;
/**
 * 
 * @author Person B
 *
 */
public class DBMessageProvider implements IMessageProvider{
	@Override
	public String fetchMessage() {
		System.out.println("***fetchDBMessage()***");
		return "interfaces make our code flexible!";
	}
}
