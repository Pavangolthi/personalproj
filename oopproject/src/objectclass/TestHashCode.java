package objectclass;

public class TestHashCode {
	public static void main(String[] args) {
		/*
		Item item1 = new Item(101,"iPhone",400);
		Item item2 = new Item(101,"iPhone",400);
		
		System.out.println(item1.hashCode());
		System.out.println(item2.hashCode());*/
		
		
		String s1 = new String("Hello World");
		String s2 = new String("Hello World");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		float f=  123.12f;
		System.out.println(Float.floatToIntBits(f));
		
	}
}
