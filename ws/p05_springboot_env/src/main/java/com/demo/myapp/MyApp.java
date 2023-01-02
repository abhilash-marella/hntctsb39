package com.demo.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class MyApp implements CommandLineRunner {
	@Autowired
	Environment env;	
	
	@Value("${myapp.test}")
	String test;

	@Value("${myapp}")
	String demo;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("My app is running");
		System.out.println("DEMO: "+env.getProperty("DEMO"));
		System.out.println("NUMBER_OF_PROCESSORS: "+env.getProperty("NUMBER_OF_PROCESSORS"));
		System.out.println("OS: "+env.getProperty("OS"));
		System.out.println("PROCESSOR_ARCHITECTURE: "+env.getProperty("PROCESSOR_ARCHITECTURE"));
		System.out.println("Path: "+env.getProperty("Path"));
		System.out.println();
		System.out.println("Properties test: "+test);
		System.out.println("Properties->Env demo: "+demo);
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MyApp.class, args);
		
		// after app is running... 
//		run();
	}

}
