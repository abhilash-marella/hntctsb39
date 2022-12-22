package com.demo.test;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import com.demo.Greeting;
import com.demo.GreetingException;

public class T02_GreetTest {
	
	
	@Test
	@Timeout(value = 6000, unit = TimeUnit.MILLISECONDS)
	public void shouldWait() {
		Greeting g = new Greeting();
		
		Assertions.assertEquals("Hello user", g.sayHello());
	}
	
	@Test
	@Disabled
	public void shouldGreetUser() throws GreetingException {
		Greeting g = new Greeting();
		String result = g.greet("arUN");
		String expected = "Welcome Arun";
		
		Assertions.assertEquals(expected, result);
	}
	
	@Test
	public void shouldGreetUser2() throws GreetingException {
		Greeting g = new Greeting();
		String result = g.greet("   arUN    ");
		String expected = "Welcome Arun";
		
		Assertions.assertEquals(expected, result);
	}
	
	@Test
	public void shouldNotGreetUserWithNull() {
		Greeting g = new Greeting();

		Assertions.assertThrows(GreetingException.class, ()->{
			g.greet(null);			
		});
	}
	
	@Test
	public void shouldNotGreetUserWithEmptyString() {
		Greeting g = new Greeting();

		Assertions.assertThrows(GreetingException.class, ()->{
			g.greet("");
		});
	}
	
}
