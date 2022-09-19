import java.util.ArrayList;
import java.util.Collections;


public class TestComparable {

	public static void main(String[] args) {
		ArrayList<Item> al = new ArrayList<Item>();
		
		Item i3 = new Item(103,"BlackBerry",350);
		Item i2 = new Item(102,"OnePlus",300);
		Item i1 = new Item(101,"IPhone",400);
		Item i4 = new Item(104,"Note10",250);
		
		al.add(i1);
		al.add(i2);
		al.add(i3);
		al.add(i4);
		
		//Collections.sort(al);
		Collections.sort(al, new Item());
		for (Item item : al) {
			System.out.println(item);
		}		
		
	}

}
