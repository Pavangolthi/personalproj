package list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Iterator {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Sravan");
		ll.add("RamChandu");
		ll.add("Krishna");
		ll.add("Priya");
		
		java.util.Iterator<String> iterator = ll.iterator();
		
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		//get an element at a given index
		System.out.println(ll.get(2));
		//replaces the element with the given element at the given index
		ll.set(1, "Reddy");
		System.out.println(ll);
		
		//ListIterator is used to traverse through a list object backwards too and has additional methods to Iterator class.
		ListIterator<String> li = ll.listIterator();
		
		li.next();
		li.next();
		li.next();
		
		System.out.println(li.previous());
		System.out.println(li.nextIndex());
		li.previous();
		li.previous();
		System.out.println("Previous index"+li.previousIndex());
		
		//replaces the element which is returned by the next() or previous()
		li.set("Kambapu");
		System.out.println(ll);
		
		//adds an element into the list 
		li.add("Ammaji");
		
		li.next();
		li.remove();
		
		List<String> sublist = ll.subList(0, 3);
		System.out.println(sublist);
		
		System.out.println(ll);
	}
	

}
