package com.demo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// @Controller // mvc -> return string -> view/page name
@RestController // @Controller + @ResponseBody
public class UserController {
    
    @GetMapping("/greet")
    // @ResponseBody
    public String greetUser(){
        System.out.println("In greet user method+++++");
        return "Welcome user";
    }

    @GetMapping("/users")
    // @ResponseBody
    public List<String> getUsers(){
        System.out.println("In get users method+++++");
        return List.of("Shounak", "Abhilash", "Lakshmi", "Jyoti", "Raja");
    }

}
