package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import com.demo.entities.Movie;
import com.demo.services.MovieService;

@SpringBootApplication
@EnableCaching
public class MyApp  implements CommandLineRunner {

	@Autowired
	private MovieService service;

	@Override
	public void run(String... args) throws Exception {
		service.saveMovie(new Movie("Hulk is green", "Bruce", 4.1));
		service.saveMovie(new Movie("Thor is back", "Miley", 4.8));
		service.saveMovie(new Movie("Antman is not ant", "Arun", 3.9));
		service.saveMovie(new Movie("Ironman is red", "Jaivik", 4.4));
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MyApp.class, args);
	}

}
