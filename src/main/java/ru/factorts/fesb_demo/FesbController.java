package ru.factorts.fesb_demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FesbController {

    @RequestMapping
    public String helloWorld() {
        return "Hello World from Spring Boot";
    }

}
