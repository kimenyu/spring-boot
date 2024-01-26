package com.learningsprinbboot.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {


    @GetMapping("/")
    public String helloWorld() {
        return "Welcome to spring boot learnings";
    }
}
