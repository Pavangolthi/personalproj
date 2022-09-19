package objectclass;

public class TestEquals {

	public static void main(String[] args) {
	/*	String s1 = new String("Hello World");
		String s2 = new String("Hello World");
		
		System.out.println(s1.equals(s2));*/
		
		//null objects
		Item item = null;
		
		//non-null references
		Item item1 = new Item(101,"iPhone",400);
		Item item2 = new Item(101,"iPhone",400);
		
		System.out.println(item1.equals(item2));
		System.out.println(item1.equals(item));
		
				
	}

}
