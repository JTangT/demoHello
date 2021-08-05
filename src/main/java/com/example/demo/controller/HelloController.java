package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";

    }
    @RequestMapping("/hello2")
    public String hello2() {
        return "Hello World2!";

    }
    @RequestMapping("/hello3")
    public String hello3() {
        return "Hello Worl2!";

    }
}
