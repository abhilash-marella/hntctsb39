package com.demo.d_03;

import java.util.function.BiFunction;

class Calculator{
	public int add(int a, int b) {
		return a+b;
	}
	static public int mul(int a, int b) {
		return a*b;
	}
}

public class ReferenceDemo01 {
	public static void main(String[] args) {
		
		// duplicate code
		// BiFunction<Integer, Integer, Integer> sum = (x, y)->{return x+y;};
		// Method Reference
		BiFunction<Integer, Integer, Integer> addition = new Calculator()::add;
		// Static Method Reference
		BiFunction<Integer, Integer, Integer> multiplication = Calculator::mul;
	}
}
