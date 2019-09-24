package org.futuristic.dilearning.controller;

import org.futuristic.dilearning.service.IGreeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private IGreeting greeting;

    @Autowired
    public void setGreeting(IGreeting greeting) {
        this.greeting = greeting;
    }

    public String sayHello() {
        return greeting.greeting();
    }
}
