interface Abc{
	void abc();
}

class AbcImpl implements Abc{

	@Override
	public void abc() {
		System.out.println("This is a interface implemented class' method");
	}
	
	public void another() {
		System.out.println("this is a different method");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc obj = new AbcImpl();// this object can only access the methods declared in the interface. Any additional methods custom to
		// the class implementing interface cannot be accessed using this object reference.
		obj.abc();
		AbcImpl obj1 = new AbcImpl();// this object can access all the methods of the interface as well as additional methods
	}

}
