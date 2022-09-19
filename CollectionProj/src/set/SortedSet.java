package set;

import java.util.TreeSet;

public class SortedSet {

	public static void main(String[] args) {	
		TreeSet t = new TreeSet();
		
		t.add("A"); 
		t.add("a"); 
		t.add("B"); 
		t.add("Z"); 
		t.add("L");
		
		t.add(10);//CCE
		
		//We cannot add null as the first object to the empty treeset, it throws NPE
		t.add(null);//NPE
		
		//t.add("A");
		System.out.println(t);//[A,B,L,Z,a]
	}

}
