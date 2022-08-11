package com.example.springboothelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class hello {

    @GetMapping
    private String springBootHello() {
        return "hello world.....";
    }


    @GetMapping("/world")
    private String springBootHelloWorld(){
        return "hello";
    }

    @GetMapping("/h")
    private String spring(){
        return "gh";
    }
}
