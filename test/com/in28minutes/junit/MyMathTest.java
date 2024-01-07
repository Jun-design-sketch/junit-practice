package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	@Test
	void test() {
//		fail("Not yet implemented");
		
		int[] numbers = {1, 2, 3};
		MyMath math = new MyMath();
		int result = math.calculateSum(numbers);
		System.out.println(result);
		int expectedResult = 5;
		assertEquals(expectedResult, result);
		
		// Absence of failure is success
		// Test Condition or Assert
	}

}