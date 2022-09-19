package com.mtc.math;

public class Rectangle {
	
	private int length;
	private int breadth;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public int calculateArea() {
		return length*breadth;
	}
}
