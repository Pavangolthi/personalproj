package map;

import java.util.Comparator;
import java.util.TreeMap;

public class CustomizedSort {

	public static void main(String[] args) {
		TreeMap t = new TreeMap(new MyComparator());
		t.put("XXX", 10);
		t.put("AAA", 20);
		t.put("ZZZ", 30);
		t.put("LLL", 40);
		
		System.out.println(t);
	}

}
class MyComparator implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		String s1 = arg0.toString();
		String s2 = arg1.toString();
		return s2.compareTo(s1);
	}
	
}
