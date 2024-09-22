package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoA {
    @GetMapping("/demoA")
    public String getData() {return "Hi Guys this is my 1st project in DEVOPS - Yogesh Trivedi" ; }
}
