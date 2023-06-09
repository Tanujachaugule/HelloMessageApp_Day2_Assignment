package com.bridgelabz.springdemo.controller;

import com.bridgelabz.springdemo.entity.Person;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {
    @GetMapping("/hello")
    public String helloMessage() {
        return "Hello from BridgeLabz";
    }
    @GetMapping(value = "/query")
    public String sayHelloMessage(@RequestParam(value = "name") String name) {
        return "Hello "+name+" from BridgeLabz";
    }
}
