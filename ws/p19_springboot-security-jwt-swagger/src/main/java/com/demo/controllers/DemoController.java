package com.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/item")
public class DemoController {
    // admin
    @GetMapping("/block")
    public String blockItem(){
        return "Only admin can block item";
    }
    // seller, admin
    @GetMapping("/create")
    public String createItem(){
        return "Only seller can create item";
    }
    // buyer, seller, admin
    @GetMapping("/buy")
    public String buyItem(){
        return "Only buyer can create item";
    }

    @GetMapping("/")
    public String fetchItems(){
        return "Only valid user can see items";
    }
}
