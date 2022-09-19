package assignment1;

import java.util.Scanner;

class Circle {

	public static void main(String[] args) {
		final double PI = 3.14;
		float radius;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the radius of the circle");
		radius = scanner.nextFloat();
		
		System.out.println("Enter \"A\" to find the area of the circle and \"C\" to find the circumference of the circle");
		String input = scanner.next();
		if(input.toUpperCase().equals("A")) {
			System.out.println("Area of the Cirlce is "+PI*radius*radius);
		}else if(input.toUpperCase().equals("C")){
			System.out.println("Circumference of the Cirlce is "+2*PI*radius);
		}else {
			System.out.println("Enter a valid input");
		}
		
		scanner.close();
	}

}
