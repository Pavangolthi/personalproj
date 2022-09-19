package set;

import java.util.Comparator;
import java.util.TreeSet;

public class StringComparator {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new StrComparator());
		
		t.add("Sravan");
		t.add("Swathi");
		t.add("Krishna");
		t.add("RamChandu");
		t.add("Priya");
		System.out.println(t);
	}

}

class StrComparator implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String)o1;
		String s2 = o2.toString();
		return -s1.compareTo(s2);
		// return s2.compareTo(s1);
	}
	
}
