
public class AbDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iphone obj = new Iphone();
		SamsungS4 obj1 = new SamsungS4();
		show(obj);
	}
	/* Instead of having two methods with same function, we can use abstract classes here
	public static void show(Iphone obj) {
		obj.showConfig();
	}
	public static void show(SamsungS4 obj) {
		obj.showConfig();
	}
	*/
	
	//Creating a method which takes Phone object as parameter 
	public static void show(Phone obj) {
		obj.showConfig();
	}
}
//this class is extended by Iphone and Samsung classes to implement a common meth	od 
abstract class Phone{
	abstract void showConfig(); 
}

class Iphone extends Phone{
	public void showConfig() {
		System.out.println("2Gb, IOS 9.3v");
	}
}

class SamsungS4 extends Phone{
	public void showConfig() {
		System.out.println("2Gb, Lollipop");
	}
}