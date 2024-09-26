package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoE {
    @GetMapping("/demoE")
    public String getData() {return " private repo Hi Guys this is my 1st project in DEVOPS Class E devloped - Yogesh Trivedi" ; }
}
