package list;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println(v.capacity());
		for(int i=0; i<=9; i++) {
			v.add(i);
		}
		System.out.println(v.capacity());
		v.add('A');
		//the capacity get doubled when we add an extra element
		System.out.println(v.capacity());
		System.out.println(v);
	}

}
