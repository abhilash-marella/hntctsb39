package com.demo;

public class Calculator {

	public int add(int ...varargs) {
		int sum = 0;
		for(int n:varargs) {
			sum += n;
		}
		return sum;
	}
	
//	public int add(int a, int b, int c, int d) {
//		return a+b+c+d;
//	}
	
}
