package com.demo.test;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import com.demo.Calculator;


public class T01_DemoTest {

	@Test
	public void shouldAdd2Nums() {
		Calculator cal = new Calculator();
		
		int input1 = 4;
		int input2 = 3;
		int expectedResult = 7;
		
		int actualResult = cal.add(input1, input2);
		
		Assertions.assertEquals(expectedResult, actualResult, "Addition of "+input1+" and "+input2+" is not "+expectedResult+", but result is "+actualResult);
		Assertions.assertTrue(expectedResult == actualResult, "Addition of "+input1+" and "+input2+" is not "+expectedResult+", but result is "+actualResult);
	}
	
	@Test
	public void shouldAdd4Nums() {
		Calculator cal = new Calculator();
		
		int input1 = 4;
		int input2 = 3;
		int input3 = 4;
		int input4 = 3;
		int expectedResult = 14;
		
		int actualResult = cal.add(input1, input2, input3, input4);
		
		Assertions.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void shouldAdd5Nums() {
		Calculator cal = new Calculator();
		
		int input1 = 4;
		int input2 = 3;
		int input3 = 4;
		int input4 = 3;
		int input5 = 3;
		int expectedResult = 17;
		
		int actualResult = cal.add(input1, input2, input3, input4, input5);
		
		Assertions.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void shouldAdd0Nums() {
		Calculator cal = new Calculator();
		
		int expectedResult = 0;
		
		int actualResult = cal.add();
		
		Assertions.assertEquals(expectedResult, actualResult);
	}
	
}
