import java.util.Arrays;
import java.util.Comparator;

//Sorting
public class ArraysDemo {

	public static void main(String[] args) {
		int[] a = {10,5,20,11,6};
		
		System.out.println("Primitive array before sorting");
		for (int i : a) {
			System.out.println(i);
		}
		Arrays.sort(a);
		System.out.println("Primitive array after sorting");
		for (int i : a) {
			System.out.println(i);
		}
		
		String[] s = {"A","Z","B"};
		System.out.println("Object array before sorting");
		for (String str : s) {
			System.out.println(str);
		}
		Arrays.sort(s);
		System.out.println("Object array after sorting");
		for (String str : s) {
			System.out.println(str);
		}
		
		Arrays.sort(s, new StringComparator());
		System.out.println("Object after sorting by comparator");
		for (String string : s) {
			System.out.println(string);
		}
	}

}

class StringComparator implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		return arg1.toString().compareTo(arg0.toString());
	}
	
}
