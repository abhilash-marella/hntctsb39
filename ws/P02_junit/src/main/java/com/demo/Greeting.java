package com.demo;

public class Greeting {
	
	public String greet(String name) throws GreetingException {
		return "Welcome "+capitalize(name);
	}
	
	private String capitalize(String str) throws GreetingException {
		try {
			str = str.trim();
			return (str.charAt(0)+"").toUpperCase() + str.substring(1).toLowerCase();
		} catch(NullPointerException ex) {
			throw new GreetingException("Name can not be null", ex);
		} catch(StringIndexOutOfBoundsException ex) {
			throw new GreetingException("Name can not be empty", ex);
		}
	}
	
	
	public String sayHello() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Hello user";
	}

}
