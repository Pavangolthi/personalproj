interface I{
	default void show() {
		System.out.println("In the interface I");
	}
}

interface J{
	default void show() {
		System.out.println("In the interface J");
	}
}

class A{
	public void show() {
		System.out.println("In the class A");
	}
}

class C extends A implements I{
	public C() {
		// TODO Auto-generated constructor stub
	}
}
public class InterfaceDemo3 {

	public static void main(String[] args) {
		C obj = new C();
		obj.show();//Even though the class is extended and interface is implemented, the class is given higher priority compared to interface
	}

}  


/*
interface I{
	//Using the static keyword, we can define methods and no need to create a class to implement those methods and such methods can be
	// accessed using the interface name itself
	static void show() {
		System.out.println("This is interface");
	}
}
public class InterfaceDemo3 {

	public static void main(String[] args) {
		I.show();
	}

}
*/
