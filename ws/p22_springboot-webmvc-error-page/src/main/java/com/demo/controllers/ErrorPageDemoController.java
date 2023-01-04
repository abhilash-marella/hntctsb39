package com.demo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
public class ErrorPageDemoController {

    // get -> 405
    @PostMapping("/names")
    @ResponseBody
    public List<String> getName(){
        return List.of("Shounak", "Abhilash", "Lakshmi", "Jyoti", "Raja");
    }


    // /payment/page -> 404
    // divide by zero -> 500
    @GetMapping("/div/{a}/{b}")
    @ResponseBody
    public int getResult(@PathVariable int a, @PathVariable int b){
        return a/b;
    }


}
