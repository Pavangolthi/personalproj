package map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("C:/Users/srava/OneDrive/Desktop/New Text Document.txt");
		p.load(fis);
		System.out.println(p);
		String s = p.getProperty("Viraj");
		System.out.println(s);
		p.setProperty("Swathi", "Reddy");
		System.out.println(p);
		FileOutputStream fos = new FileOutputStream("C:/Users/srava/OneDrive/Desktop/New Text Document.txt");
		p.store(fos, "Updated by Sravan");
	}

}
