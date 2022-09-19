package com.mtc.math;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ArithmeticTest {
	
	@Test
	void testSum() {
		Arithmetic arithmetic = new Arithmetic();
		int actualResult = arithmetic.sum(20, 30);
		assertEquals(50, actualResult);
	}

}
