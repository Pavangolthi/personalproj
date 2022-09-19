package set;

import java.util.Comparator;
import java.util.TreeSet;

public class SBComparator {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new ComparatorSB());
		
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("L"));
		System.out.println(t);
	}

}

class ComparatorSB implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		//we cannot type cast StringBuffer objects into String but can use toString() to convert them into String objects
		String s1 = o1.toString();
		String s2 = o2.toString();
		//Default natural sorting order
		return s1.compareTo(s2);
		//Reverse of the alphabetical order
		//return s2.compareTo(s1);
	}
	
}
