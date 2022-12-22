package com.demo.d_01;

@FunctionalInterface // SAM
interface Greeting{
	public String greet(String name);
	public String toString();
//	public boolean isValid(String name);
}

class GreetingImpl implements Greeting{

	@Override
	public String greet(String name) {
		// capitalize name
		return "Welcome "+name;
	}
	
}


public class GreetingDemo {

	static void greetUser(Greeting g, String n) {
		String result = g.greet(n);
		System.out.println(result);
	}
	
	
	public static void main(String[] args) {
		String username = "SuperUser003";
		// way 1
//		GreetingImpl greetingImpl = new GreetingImpl();
		Greeting greetingImpl = new GreetingImpl();
		greetUser(greetingImpl, username);
		// way 2
		Greeting greeting = new Greeting() {

			@Override
			public String greet(String name) {
				return "Hello "+name;
			}
			
		};
		greetUser(greeting, username);
		
		// way 3 -> Lambda
		// must be an interface with SAM
		Greeting greetingLambda = (name)->{
				return "Greeting "+name;
		};
		greetUser(greetingLambda, username);
	}
	
}


