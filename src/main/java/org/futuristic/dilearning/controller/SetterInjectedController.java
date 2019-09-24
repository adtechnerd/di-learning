package org.futuristic.dilearning.controller;

import org.futuristic.dilearning.service.IGreeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private IGreeting greeting;

    @Autowired
    @Qualifier(value = "setterGreetingImpl")
    public void setGreeting(IGreeting greeting) {
        this.greeting = greeting;
    }

    public String sayHello() {
        return greeting.greeting();
    }
}
