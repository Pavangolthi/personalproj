package map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		FileInputStream fio = new FileInputStream("sample.properties");
		properties.load(fio);
		System.out.println(properties);
	}

}
