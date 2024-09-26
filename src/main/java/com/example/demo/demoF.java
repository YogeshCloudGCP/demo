package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoF {
    @GetMapping("/demoF")
    public String getData() {return "today 25 sep 28sep  I’m Yogesh Trivedi, excited to join as a DevOps learner and collaborate with you all. I have a solid background in software development with a focus on Java, and I’m now transitioning into the DevOps space to enhance my skills in automation, CI/CD, cloud infrastructure, and containerization. I’m particularly interested in working with tools like Jenkins, Docker, Kubernetes, and cloud platforms like AWS. My goal is to improve development efficiency by bridging the gap between development and operations. I’m eager to learn from your experiences, contribute to ongoing projects, and grow my knowledge in setting up pipelines, managing infrastructure, and ensuring smooth releases. I look forward to adding value to the team while embracing the DevOps culture of collaboration and continuous improvement.\n" +
            "Thank you, and I’m excited for the journey ahead!\n"; }
}
