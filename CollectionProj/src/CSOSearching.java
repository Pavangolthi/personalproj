import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CSOSearching {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(15);
		al.add(0);
		al.add(20);
		al.add(10);
		al.add(5);
		System.out.println(al);
		Collections.sort(al, new MyComparatorDemo());
		System.out.println(al);
		System.out.println(Collections.binarySearch(al, 10, new MyComparatorDemo()));
		System.out.println(Collections.binarySearch(al, 11, new MyComparatorDemo()));
		System.out.println(Collections.binarySearch(al, 17));
		Collections.reverse(al);
		System.out.println(al);
	}

}

class MyComparatorDemo implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1= (Integer)o1;
		Integer i2= (Integer)o2;
		return i2.compareTo(i1);
	}
	
}