package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoG {
    @GetMapping("/demoG")
    public String getData() {return "I’m Yogesh Trivedi, 222 DEMO GGGGGGGexcited to join as a DevOps learner and collaborate with you all. I have a solid background in software development with a focus on Java, and I’m now transitioning into the DevOps space to enhance my skills in automation, CI/CD, cloud infrastructure, and containerization. I’m particularly interested in working with tools like Jenkins, Docker, Kubernetes, and cloud platforms like AWS. My goal is to improve development efficiency by bridging the gap between development and operations. I’m eager to learn from your exp!\n"; }
}