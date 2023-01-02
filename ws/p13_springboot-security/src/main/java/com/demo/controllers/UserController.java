package com.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @GetMapping("/")
    public String getHomePage(){
        return "Home Page"; // text
    }

    @GetMapping("/greet")
    public String greetUser(){
        return "Welcome user";
    }

    @GetMapping("/users")
    public List<String> getUsers(){
        return List.of("Shounak", "Abhilash", "Lakshmi", "Jyoti", "Raja");
    }

}
