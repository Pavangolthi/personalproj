package objectclass;

public class TestToString {
	public static void main(String[] args) {
		
		Item item1 = new Item(101,"iPhone",400);
		Item item2 = new Item(101,"iPhone",400);
		
		System.out.println(item1);
		System.out.println(item2.toString());
		
		String s1 = new String("Hello World");
		String s2 = new String("Hello World");
		
		System.out.println(s1.toString());
	}
	
	
}
