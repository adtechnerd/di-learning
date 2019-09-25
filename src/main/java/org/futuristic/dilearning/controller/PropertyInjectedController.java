package org.futuristic.dilearning.controller;

import org.futuristic.dilearning.service.GreetingImpl;
import org.futuristic.dilearning.service.IGreeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingImpl")
    public IGreeting greetingImpl;

    public String sayHello(){
        return greetingImpl.greeting();
    }
}
