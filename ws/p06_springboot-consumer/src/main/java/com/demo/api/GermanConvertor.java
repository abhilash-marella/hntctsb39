package com.demo.api;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class GermanConvertor implements MessageConvertor {

	@Override
	public void convert(String input) {
		System.out.println("German message: "+input);
	}
	
}
