package assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		
		Supplier supplier2 = new Supplier();
		supplier2.setId(111);
		supplier2.setName("Tata");
		supplier2.setCode("TA01");

		Supplier supplier3 = new Supplier();
		supplier3.setId(112);
		supplier3.setName("Reliance");
		supplier3.setCode("RE02");
		
		Supplier supplier1 = new Supplier();
		supplier1.setId(113);
		supplier1.setName("Hyundai");
		supplier1.setCode("HY03");
		
		Supplier supplier5 = new Supplier();
		supplier5.setId(114);
		supplier5.setName("AdityaBirla");
		supplier5.setCode("AB04");
		
		Supplier supplier4 = new Supplier();
		supplier4.setId(101);
		supplier4.setName("Ranbaxy");
		supplier4.setCode("RA05");
		
		ArrayList<Supplier> suppArr = new ArrayList<Supplier>();
		
		suppArr.add(supplier1);
		suppArr.add(supplier2);
		suppArr.add(supplier3);
		suppArr.add(supplier4);
		suppArr.add(supplier5);
		
		/*
		 * System.out.println(supplier1.equals(supplier2));
		 * System.out.println(supplier1.equals(supplier3));
		 * System.out.println(supplier1.hashCode());
		 * System.out.println(supplier2.hashCode());
		 * System.out.println(supplier3.hashCode());
		 * System.out.println(supplier1.toString());
		 */
		/*
		 * suppArr.add(2, supplier1); System.out.println(suppArr);
		 * System.out.println(suppArr.get(5));
		 * 
		 * ArrayList a = new ArrayList(); a.add(1); a.add("A");
		 */
	
		Iterator<Supplier> iterator = suppArr.iterator();
		/*
		while(iterator.hasNext()) {
			Supplier supplier = iterator.next();
			System.out.println(supplier);
		}
		*/
		//Collections.sort(suppArr);
		System.out.println("Before Sorting");
		for (Supplier supplier : suppArr) {
			System.out.println(supplier);
		}
		System.out.println();
		System.out.println("After Sorting");
		Collections.sort(suppArr, new Supplier());
		for (Supplier supplier : suppArr) {
			System.out.println(supplier);
		}
		
	}

}
