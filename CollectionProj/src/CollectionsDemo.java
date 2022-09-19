import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Z");
		al.add("A");
		al.add("K");
		al.add("N");
		//al.add(new Integer(10));//RE:CCE
		//al.add(null);//RE:NPE
		System.out.println("Before Sorting "+al);
		Collections.sort(al);
		System.out.println("After Sorting "+al);
	}

}
