package com.bridgelabz.springdemo.controller;

import com.bridgelabz.springdemo.entity.User;
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
    @GetMapping("/param/{name}")
    public String helloMessage(@PathVariable String name) {
        return "Hello "+name+" from BridgeLabz";
    }
    @PostMapping("/post")
    public String helloUser(@RequestBody User user) {
        return "Hello "+user.getFirstName()+" "+user.getLastName()+" from BridgeLabz";
    }
    @PutMapping("/put/{firstName}")
    public String helloUser(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello "+firstName+" "+lastName+" from BridgeLabz";
    }
}
