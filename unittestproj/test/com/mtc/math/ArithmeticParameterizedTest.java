package com.mtc.math;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
class ArithmeticParameterizedTest {
	
	private int n1;
	private int n2;
	private int expectedResult;
	
	
	
	public static Stream<int[]> dataSet(){
		return Stream.of(new int[] {10,20,30},new int[] {50,70,120},new int[] {40,90,130});
	}

	@ParameterizedTest
	@MethodSource("dataSet")
	void testSum(int[] arr) {
		n1 = arr[0];
		n2 = arr[1];
		expectedResult = arr[2];
		Arithmetic arithmetic = new Arithmetic();
		int actualResult = arithmetic.sum(n1, n2);
		Assertions.assertEquals(expectedResult, actualResult);
	}

}
