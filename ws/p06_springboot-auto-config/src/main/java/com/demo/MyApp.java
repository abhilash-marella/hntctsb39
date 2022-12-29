package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.demo.api.MessageConvertor;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.demo.api"})
public class MyApp { //implements CommandLineRunner {
	
//	@Autowired
//	MessageConvertor convertor;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		convertor.convert("huglu buglu");
//	}
	
	public static void main(String[] args) {
		SpringApplication.run(MyApp.class, args);
	}

}
