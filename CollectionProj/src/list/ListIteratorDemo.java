package list;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("Balakrishna");
		ll.add("Venky");
		ll.add("Nag");
		ll.add("Chiru");
		System.out.println(ll);
		ListIterator ltr = ll.listIterator();
		while(ltr.hasNext()) {
			String str = (String) ltr.next();
			
			if(str.equals("Venky")) {
				ltr.remove();
			}else if(str.equals("Nag")) {
				ltr.add("Chaitu");
			}else if(str.equals("Chiru")) {
				ltr.set("Charan");
			}
		}
		System.out.println(ll);
	}

}
