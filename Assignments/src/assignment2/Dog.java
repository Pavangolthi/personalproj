package assignment2;

public class Dog extends Animal{
	public Dog() {
		// TODO Auto-generated constructor stub
	}

	public Dog(String color, float weight, float height, int age) {
		super(color, weight, height, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makesSound() {
		System.out.println("Bark!!!");
	}

}
