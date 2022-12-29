package com.demo.api;

import org.springframework.stereotype.Component;

//@Component  // create object==bean
public class EnglishConvertor implements MessageConvertor {

	@Override
	public void convert(String input) {
		System.out.println("English message: "+input);
	}
	
}
