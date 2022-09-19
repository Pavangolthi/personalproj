package objectclass;

public class TestClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Item itemOriginal = new Item(101,"iPhone",400);
		
		//In order to clone an object we need to make the object eligible for cloning by making the class to which the object belongs 
		// to implement Cloneable interface.
		
		Item itemClone = (Item) itemOriginal.clone();
		
		System.out.println(itemClone == itemOriginal);
		System.out.println(itemClone.equals(itemOriginal));
	}

}
