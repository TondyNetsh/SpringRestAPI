package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    // GET HTTP method
    // http://localhost:8080/helloworld
    @GetMapping("/helloworld")
    public String helloWorld() {
        return "Hello World!";
    }
}
