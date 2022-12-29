package com.demo.api;

import org.springframework.stereotype.Component;

@Component
public class JapaneseConvertor implements MessageConvertor {

	@Override
	public void convert(String input) {
		System.out.println("Japanese message: "+input);
	}
	
}
