import java.util.ArrayList;
import java.util.Collections;

public class DNSOSearching {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Z");
		al.add("A");
		al.add("M");
		al.add("K");
		al.add("a");
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		System.out.println(Collections.binarySearch(al, "Z"));//3
		System.out.println(Collections.binarySearch(al, "J"));//-2
		
	}

}
