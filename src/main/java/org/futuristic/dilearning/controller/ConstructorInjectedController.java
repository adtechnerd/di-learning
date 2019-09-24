package org.futuristic.dilearning.controller;

import org.futuristic.dilearning.service.IGreeting;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private IGreeting greeting;

    public ConstructorInjectedController(IGreeting greeting) {
        this.greeting = greeting;
    }

    public String sayHello(){
        return greeting.greeting();
    }
}
