package com.demo.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.demo.Calculator;

public class T03_ParameterizedTest {

	@ParameterizedTest(name="#{index} Testing value #{arguments}")
	@ValueSource(ints = {1,2,4})
	public void testParams(int arg) {
		System.out.println("argument is : "+arg);
		Assertions.assertTrue(arg>0);
	}
	
	@ParameterizedTest()
	@CsvSource({
		"1,2,3",
		"-9,5,-4",
		"1,-1,0",
		"3,12,15",
		"4,9,13"
	}) 
	public void testParams(int a, int b, int c) {
		Calculator calc = new Calculator();
		System.out.println("a: "+a+", b: "+b+", c: "+c);
		Assertions.assertEquals(c, calc.add(a, b));
	}
	
}
