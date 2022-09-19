package com;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		product(a,b);
		scanner.close();
	}
	public static void product(double a , double b) {
		System.out.println("Product is "+(a*b));
	}
}
