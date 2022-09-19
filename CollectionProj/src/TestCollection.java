import java.util.ArrayList;
import java.util.LinkedList;

public class TestCollection {
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Sravan");
		names.add("RamChandu");
		names.add("Krishna");
		names.add("Priya");
		
		System.out.println(names.size());
		
		System.out.println(names.contains("Sravan"));
		
		System.out.println(names.isEmpty());
		
		//returns an array object 
		Object[] objarr = names.toArray();
		
		for (Object object : objarr) {
			System.out.println(object);
		}
		
		//returns boolean value if it removes an element
		System.out.println("Hey "+names.remove("Anil"));
		
		//to store the values in a specific array 
		String[] strArr = new String[names.size()];
		
		names.toArray(strArr);
		
		for (String string : strArr) {
			System.out.println(string);
		}
		/*
		 * LinkedList<String> name = new LinkedList<String>(); name.add("Sravan");
		 * name.add("RamChandu"); name.add("Krishna"); name.add("Priya");
		 * 
		 * System.out.println(name.size());
		 * 
		 * System.out.println(name.contains("Sravan"));
		 */
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.addAll(names);
		ll.add("Super");
		
		for (String string : ll) {
			System.out.println("Ll "+string);
		}
		
		//removes all the common elements
		//System.out.println(names.removeAll(ll));
		
		names.retainAll(ll);
		System.out.println(names);
		
		//checks whether the second collections is a subset of first collection or not
		System.out.println(names.containsAll(ll));
		
		//clears all the elements of the collection
		names.clear();
		System.out.println(names);
		
		System.out.println(ll.hashCode());

	}

}
