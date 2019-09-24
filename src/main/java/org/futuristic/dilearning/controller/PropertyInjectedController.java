package org.futuristic.dilearning.controller;

import org.futuristic.dilearning.service.GreetingImpl;
import org.futuristic.dilearning.service.IGreeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public IGreeting greetingImpl;

    public String sayHello(){
        return greetingImpl.greeting();
    }
}
