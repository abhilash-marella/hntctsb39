package com.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApp implements CommandLineRunner {
	
	@Value("${sdu}")
	private String url;
	@Value("${sdp}")
	private String password;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Url: "+url);
		System.out.println("Pasword: "+password);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MyApp.class, args);
	}

}
