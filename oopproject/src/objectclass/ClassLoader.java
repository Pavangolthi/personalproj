package objectclass;

public class ClassLoader {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// loads the given class into memory
		Class class1 = Class.forName("objectclass.Item");
		
		//Creating an instance of the class
		Item item = (Item) class1.newInstance();
			
	}

}
