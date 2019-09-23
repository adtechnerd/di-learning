package org.futuristic.dilearning.controller;

import org.futuristic.dilearning.service.IGreeting;

public class SetterInjectedController {

    private IGreeting greeting;

    public void setGreeting(IGreeting greeting) {
        this.greeting = greeting;
    }

    public String sayHello() {
        return greeting.greeting();
    }
}
