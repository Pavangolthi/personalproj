import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Z");
		al.add("A");
		al.add("K");
		al.add("N");
		System.out.println("Before Sorting "+al);
		Collections.sort(al, new MyComparator());
		System.out.println("After Sorting "+al);
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