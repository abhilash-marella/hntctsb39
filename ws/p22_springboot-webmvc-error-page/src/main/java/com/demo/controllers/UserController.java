package com.demo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
public class UserController {
    
    @GetMapping("/greet")
    public String greetUser(){
        System.out.println("In greet user method+++++");
        return "greet";
        // => /templates/greet.html
    }

    @GetMapping("/home")
    public String homePage(){
        return "home";
        // => /templates/home.html
    }

    @GetMapping("/register")
    public String signupPage(){
        return "user/signup";
        // => /templates/user/signup.html
    }
    @GetMapping("/login")
    public String loginPage(){
        return "user/login";
        // => /templates/user/login.html
    }

    @GetMapping("/users")
    @ResponseBody
    public List<String> getUsers(){
        System.out.println("In get users method+++++");
        return List.of("Shounak", "Abhilash", "Lakshmi", "Jyoti", "Raja");
    }

}
