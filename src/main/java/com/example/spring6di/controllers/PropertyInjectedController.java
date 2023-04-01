package com.example.spring6di.controllers;

import com.example.spring6di.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
