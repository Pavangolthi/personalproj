package assignment2;

public abstract class Animal {
	String color;
	float weight;
	float height;
	int age;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	public Animal(String color, float weight, float height, int age) {
		super();
		this.color = color;
		this.weight = weight;
		this.height = height;
		this.age = age;
	}

	public abstract void makesSound();
	
}
