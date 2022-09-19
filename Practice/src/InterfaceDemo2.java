
interface Xyz{
	void show();
}

interface Pqr{
	void display();
}
//Interface extends another interface. Class implements interface. Class extends another class
interface Lmn extends Pqr{
	default void anything() {
		System.out.println("this is a method defined in the interface");
	}
}

class Next implements Lmn{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This display is defined in the class implementing the interface");
	}
	
}
public class InterfaceDemo2 {

	public static void main(String[] args) {
		
		//Even the method can be defined in this way
		Xyz obj = new Xyz()//Since the name of the class is not mentioned, these are defined as anonymous classes
		{
			public void show() {
				System.out.println("In show");
			}
		};	
		obj.show();
		
		Pqr obj1 = () ->{
			//If there is only one line of code, then we can remove the curly braces and the semi colon and define it in on eline
				System.out.println("This is an example of the lambda expression");
		};
		obj1.display();
		
		Pqr next = new Next();
		
	}

} 




/*
interface I{
	default void show() {
		System.out.println("This is show in interface I");
	}
}

interface J{
	default void show() {
		System.out.println("This is show in interface J");
	}
}

class C implements I,J{
	public void show() {
		System.out.println("hi there!!!");
	}
}
public class InterfaceDemo2{
	public static void main(String[] args) {
		C obj = new C();
		obj.show();
	}
}

If there are methods with the same name in both interfaces and the class is extending the 2 interfaces, then it is mandatory to implement
the same method with its implementation in the class to tell the compiler and clarify the confusion.
*/

