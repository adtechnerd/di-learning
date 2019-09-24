package org.futuristic.dilearning.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingImpl implements IGreeting{
    @Override
    public String greeting() {
        return "Hello I am injected through Setter Injection method";
    }
}
