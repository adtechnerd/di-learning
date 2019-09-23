package org.futuristic.dilearning.controller;

import org.futuristic.dilearning.service.IGreeting;

public class ConstructorInjectedController {

    private IGreeting greeting;

    public ConstructorInjectedController(IGreeting greeting) {
        this.greeting = greeting;
    }

    public String sayHello(){
        return greeting.greeting();
    }
}
