import java.util.Arrays;
import java.util.Comparator;

//Searching
public class ArraysDemo2 {

	public static void main(String[] args) {
		int[] a = {10,5,20,11,6};
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 6));
		System.out.println(Arrays.binarySearch(a, 14));
		
		String[] s = {"A","Z","B"};
		Arrays.sort(s);
		System.out.println(Arrays.binarySearch(s, "Z"));
		System.out.println(Arrays.binarySearch(s, "S"));
		
		Arrays.sort(s, new SearchingComparator());
		System.out.println(Arrays.binarySearch(s, "Z", new SearchingComparator()));
		System.out.println(Arrays.binarySearch(s, "S", new SearchingComparator()));
		System.out.println(Arrays.binarySearch(s, "N"));
	}

}
class SearchingComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return o2.toString().compareTo(o1.toString());
	}
	
}
