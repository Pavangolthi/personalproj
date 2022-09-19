package assignment1;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float length;
		float breadth;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the length of the rectangle");
		length = scanner.nextFloat();
		System.out.println("Enter the breadth of the rectangle");
		breadth = scanner.nextFloat();
		
		System.out.println("Enter \"A\" to find the area of the rectangle and \"P\" to find the perimeter of the rectangle");
		String input = scanner.next();
		if(input.toUpperCase().equals("A")) {
			System.out.print("Area of the rectangle is "+length*breadth);
		}else if(input.toUpperCase().equals("P")){
			System.out.println("Perimeter of the rectangle is "+2*(length+breadth));
		}else {
			System.out.println("Enter a valid input");
		}
		
		scanner.close();
	}

}
