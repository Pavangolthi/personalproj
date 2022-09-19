package set;

import java.util.Comparator;
import java.util.TreeSet;

public class HeteroComparator {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new Hetero());
		
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");
		System.out.println(t);
	}

}

class Hetero implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		//Since we contain both String and StringBuffer objects it is better to use toString() to convert to String
		String s1 = o1.toString();
		String s2 = o2.toString();
		int l1 = s1.length();
		int l2 = s2.length();
		
		if(l1 < l2) {
			return -1;
		}else if(l1 > l2) {
			return 1;
		}else
			//if length is same, then we should compare the alphabetical order
			return s1.compareTo(s2);
	}
	
}
