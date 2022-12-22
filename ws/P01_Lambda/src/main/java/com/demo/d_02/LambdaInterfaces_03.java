package com.demo.d_02;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaInterfaces_03 {

	static String find(Function<Integer,String> lambda, int id) {
		return lambda.apply(id);
	}
	
	
	public static void main(String[] args) {
		String email = find((id)->{
			// find email in database where id is id
			System.out.println("Finding email id where id == "+id);
			return "arun@gmail.com";
			}, 42);
		
		System.out.println(email);

	
		String address = find((id)->{
			// find email in database where id is id
			System.out.println("Finding address id where id == "+id);
			return "New York";
			}, 24);
		
		System.out.println(address);

	
	}
	
}
