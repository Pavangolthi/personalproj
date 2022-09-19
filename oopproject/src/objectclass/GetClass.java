package objectclass;

import java.lang.reflect.Method;

public class GetClass {

	public static void main(String[] args) {
		
		Item item1 = new Item(101,"iPhone",400);
		
		Class c = item1.getClass();
		
		System.out.println("Class Name: "+c.getName());
		
		
		Method[] m  = c.getMethods();
		
		System.out.println("List of methods: ");
		for(Method m1 : m) {
			System.out.println(m1.getName());
		}
		
	}

}
