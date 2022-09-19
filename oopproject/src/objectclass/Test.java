package objectclass;

public class Test extends Object{
	public static void main(String[] args) {
		
		Item item1 = new Item(101,"iPhone",400);
		Item item2 = new Item(101,"iPhone",400);
		
		System.out.println(item1 == item2);
		
		String s1 = new String("hey");
		String s2 = new String("hey");
		System.out.println(s1 == s2);
	}
}
