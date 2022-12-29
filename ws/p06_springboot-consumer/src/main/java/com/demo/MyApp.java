package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.demo.api.JapaneseConvertor;
import com.demo.api.MessageConvertor;

@SpringBootApplication
public class MyApp implements CommandLineRunner {
	
	@Autowired
	private MessageConvertor convertor;

	@Autowired
	private JapaneseConvertor jConvertor;
	
	@Override
	public void run(String... args) throws Exception {
		convertor.convert("My message");
		jConvertor.convert("My message");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MyApp.class, args);
	}

}
