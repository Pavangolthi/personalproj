
public class AbsTestChild extends AbsTest{

	public AbsTestChild(String fn, String ln) {
		super(fn,ln);		
	}
	
	@Override
	public void sayHey() {
		// super keyword is used to invoke the method of parent class.
		super.sayHey();
		//System.out.println("Hi there this is child class 1 and my fav movie is "+favMovie+" my fav place is "+favPlace);
		
	}

}

//If a child class extends an abstract class then it must definitely implement all the abstract methods with their own implementation.