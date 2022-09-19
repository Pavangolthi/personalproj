package oopproject;

import java.util.Arrays;

public class TestMain {

	static public void main(String...args) {
		
		/*for(String str:args) {
			System.out.println(str);
		}*/
		//if integers are passed as args they should be converted to integer
		int i = Integer.parseInt(args[0]);//parseInt is an static method which is accessed using the class name
		int j = Integer.parseInt(args[1]);
		
		System.out.println(i);	
		
	
	}

}
