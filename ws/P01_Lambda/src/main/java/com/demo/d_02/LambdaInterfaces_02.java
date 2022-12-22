package com.demo.d_02;

import java.util.function.BiFunction;

public class LambdaInterfaces_02 {

	static void myTask(BiFunction<String,Integer,Integer> lambda, String e, int id) {
		lambda.apply(e, id);
	}
	
	
	public static void main(String[] args) {
		// way 3 -> Lambda
		// must be an interface with SAM
		BiFunction<String,Integer,Integer> myLambda = (e, n)->{
			System.out.println("Payment is done by: "+e);
			return 42;
		};
		myTask(myLambda, "arun@gmail.com", 1245);
	}
	
}
