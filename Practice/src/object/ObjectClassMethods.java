package object;

import java.lang.reflect.Method;

public class ObjectClassMethods {

	public static void main(String[] args) throws ClassNotFoundException {
		int count=0;		
		Class c = Class.forName("java.lang.Object");
		Method[] m = c.getDeclaredMethods();
		for(Method m1: m) {
			count++;
			System.out.println(m1.getName());
		}
		System.out.println("The number of methods are "+count);
	}

}
