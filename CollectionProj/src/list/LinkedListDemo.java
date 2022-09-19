package list;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("Sravan");
		ll.add(34);
		ll.add(null);
		ll.add("Sravan");//[Sravan,34,null,Sravan]
		ll.set(0, "RamChandu");//[RamChandu,34,null,Sravan]
		ll.add(0, "Krishna");//[Krishna,RamChandu,34,null,Sravan]
		ll.removeLast();//[Krishna,RamChandu,34,null]
		ll.addFirst("Viraj");//[Viraj,Krishna,RamChandu,34,null]
		System.out.println(ll);
		
	}

}
