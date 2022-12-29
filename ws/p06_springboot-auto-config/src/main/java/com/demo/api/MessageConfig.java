package com.demo.api;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfig {

//	public MessageConfig() {
//		System.out.println("MessageConfig: instantiation is done by spring");
//	}
	
	@Bean
	@ConditionalOnMissingBean(MessageConvertor.class)
	public MessageConvertor getEnglishConvertor() {
		return new EnglishConvertor();
	}
	
}
