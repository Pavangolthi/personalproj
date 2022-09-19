package messageprinter;
/**
 * 
 * @author sravan
 *
 */
public interface IMessageProvider {
	String fetchMessage();
	
	default String filterMessage(String keyword) {
		return "This is a filtered message";
	}
}
