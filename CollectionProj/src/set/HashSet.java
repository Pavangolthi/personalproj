package set;
import java.util.*;

public class HashSet {

	public static void main(String[] args) {
		java.util.HashSet h = new java.util.HashSet();
		h.add("A");		
		h.add("B");
		h.add("C");
		h.add(null);
		h.add("Z");
		//returns false as duplicates are not allowed in set
		System.out.println(h.add("Z"));
		//We cannot predict the output of the hashset as the elements are organized based on the hashcode of the elements i.e. insertion
		//order is not preserved
		System.out.println(h);
	}

}
