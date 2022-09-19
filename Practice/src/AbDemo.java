//Abstract class and Abstract Methods

public class AbDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MaheshPhone obj = new MaheshPhone(); We cannot instantiate abstract classes but can extend those classes and create objects
		// for the sub-classes
		MaheshPhone obj = new SureshPhone();
		obj.move();
		obj.call();
		obj.dance();
		obj.cook();
	}

}

//When you declare the methods but do not provide the implementation, such methods must be declared as abstract and the class containing
// the abstract methods must be declared as abstract classes
abstract class MaheshPhone{
	public void call() {
		System.out.println("Calling...");
	}
	public abstract void move();//Abstract methods
	public abstract void dance();
	public abstract void cook();
}
//Since this class did not implement all the methods of the parent class, this class should be declare abstract
abstract class RameshPhone extends MaheshPhone{
	public void move() {
		System.out.println("Moving...");
	}
}
//This class implemented all the methods of the parent class, this class is concrete
class SureshPhone extends RameshPhone{			//Concrete Class
	public void dance() {
		System.out.println("Dancing...");
	}
	public void cook() {
		System.out.println("Cooking...");
	}
}