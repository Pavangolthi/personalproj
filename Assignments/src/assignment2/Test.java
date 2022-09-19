package assignment2;

public class Test {

	public static void main(String[] args) {
		Lion lion = new Lion("Yellow-gold",190f,1.2f,5);
		Dog dog = new Dog("Black",15f,1f,10);
		System.out.println(dog.toString());
		
		lion.makesSound();
		dog.makesSound();
		
	}

}
