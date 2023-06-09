package com.bridgelabz.springdemo.controller;

import com.bridgelabz.springdemo.entity.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MessageController {
    @GetMapping("/hello")
    public String helloMessage() {
        return "Hello from BridgeLabz";
    }
}
