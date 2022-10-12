package com.resilience4j.example.serviceB.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/b")
public class ServiceBController {

    @GetMapping
    public String ServiceB(){
        return "Service B is called from Service A";
    }
}
