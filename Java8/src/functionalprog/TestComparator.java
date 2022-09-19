package functionalprog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestComparator {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(20);
		l.add(10);
		l.add(25);
		l.add(5);
		
		Comparator<Integer> c = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1<o2 ? -1 : o1>o2 ? 1 : 0;
	}
		};
		Collections.sort(l, c);
		
		System.out.println(l);
	}

}
