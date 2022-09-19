package list;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Hary");
		al.add("Kiran");
		al.add("Madhuri");
		al.add("Amir");
		al.add("Amy");
		al.add("Rachel");
		al.add("John");
		
		System.out.println("Before sorting");
		System.out.println(al);
		
		Collections.sort(al);
	
		System.out.println("After sorting");
		System.out.println(al);
	}

}
