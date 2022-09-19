package functionalprog;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicatedDemo2 {

	public static void main(String[] args) {
		int[] i = {0,5,10,15,20,25,30,35};
		Predicate<Integer> p1=i1->i1%2==0;
		Predicate<Integer> p2=i2->i2>10;
		
		System.out.println("Number greater than 10 and even");
		//To check if a number is greater than 10 and is an even number
		for (int j : i) {
			if(p1.and(p2).test(j)) {
				System.out.println(j);
			}
		}
		
		System.out.println("Number greater than 10 or even");
		//To check if a number is greater than 10 or an even number
		for ( int j : i) {
			if(p1.or(p2).test(j)) {
				System.out.println(j);
			}
		}
		
		System.out.println("To get numbers which are not even");
		for (int j : i) {
			if(p1.negate().test(j)) {
				System.out.println(j);
			}
		}
		
		//to check multiple condition in a single line
		Predicate<Integer> p3 = i3->i3%2==0 && i3>20;
		
		System.out.println("And condition: ");
		for (int j : i) {
			if(p3.test(j)) {
				System.out.println(j);
			}
		}
		
		Function<Integer, Integer> f=x->x*x;
		System.out.println(f.apply(5));
		
	}

}
