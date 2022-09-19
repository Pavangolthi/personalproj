package com.mtc.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectangleTest {
	
	private int n1=30;
	private int n2=20;
	private int expectedResult=600;

	@Test
	void testCalculateArea() {
		Rectangle rectangle = new Rectangle(n1,n2);
		int actualResult = rectangle.calculateArea();
		Assertions.assertEquals(expectedResult, actualResult);
	}

}
