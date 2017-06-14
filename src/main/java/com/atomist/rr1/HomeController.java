package com.atomist.rr1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(path = "/")
    public String home() {
        return "Hello REST Microservice World";
    }

    @RequestMapping(path = "/hello")
    public String hello() {
        return "Hello REST Microservice World";
    }
}
