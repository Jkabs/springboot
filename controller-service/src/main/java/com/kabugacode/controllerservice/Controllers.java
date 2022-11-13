package com.kabugacode.controllerservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controllers {

    @RequestMapping("/")
    public  String home(){

        return "Hi my name is John Kabuga";
    }

    @RequestMapping("/welcome")
    public  String welcome(){

        return "welcome to the power of Spring boot";
    }

    @RequestMapping("/topics")
    public String getAllTopics(){
        return "All topics";

    }
    @RequestMapping("/topicslist")
    public List<Topics> getTopicsList(){
        return Arrays.asList(
                new Topics("1","Spring Boot","Spring Boot Arrays"),
                new Topics("2","Devops","Learn Githib Actions")
        );
    }
}
