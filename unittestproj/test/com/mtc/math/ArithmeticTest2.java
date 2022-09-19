package com.mtc.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArithmeticTest2 {
	private int n1;
	private int n2;
	private int expectedResult;

	@BeforeEach
	void setUp() throws Exception {
		//to fetch data from the database and initialize
		//n1,n2,expectedResult;
		System.out.println("setUp() : Initialization code");
		n1=20;
		n2=50;
		expectedResult=70;
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSum() {
		Arithmetic arithmetic=new Arithmetic();
		int actualResult = arithmetic.sum(n1, n2);
		Assertions.assertEquals(expectedResult, actualResult);
	}

}
