package org.futuristic.dilearning.controller;

import org.futuristic.dilearning.service.GreetingImpl;

public class PropertyInjectedController {

    public GreetingImpl greetingImpl;

    String sayHello(){
        return greetingImpl.greeting();
    }
}
