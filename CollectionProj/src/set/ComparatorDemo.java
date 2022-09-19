package set;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());
		
		t.add(10);
		t.add(0);
		t.add(20);
		t.add(5);
		t.add(15);
		t.add(20);
		t.add(25);
		
		System.out.println(t);
	}

}

class MyComparator implements Comparator{
	
	@Override
	public int compare(Object arg0, Object arg1) {
		Integer i1 = (Integer) arg0;
		Integer i2 = (Integer) arg1;
		
		//Since compareTo() is used for default natural sorting order, the reverse of it will give the descending order
		//return -i1.compareTo(i2);
		return i2.compareTo(i1);
		
		/*if(i1 < i2) {
			return 1;
		}else if(i1 > i2) {
			return -1;
		}else {
			return 0;
		} */
	
	}
}
