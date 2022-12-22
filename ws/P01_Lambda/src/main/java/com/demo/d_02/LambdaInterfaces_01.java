package com.demo.d_02;

interface SubscribeBook{
	int doTask(String email, int bookId);
}

interface FlightBooking{
	int doTask(String email, int transactionId);
}

public class LambdaInterfaces_01 {

	static void myTask(SubscribeBook lambda, String e, int id) {
		lambda.doTask(e, id);
	}
	
	
	public static void main(String[] args) {
		// way 3 -> Lambda
		// must be an interface with SAM
		SubscribeBook fb = (e, n)->{
			System.out.println("Payment is done by: "+e);
			return 42;
		};
		myTask(fb, "arun@gmail.com", 1245);
	}
	
}
