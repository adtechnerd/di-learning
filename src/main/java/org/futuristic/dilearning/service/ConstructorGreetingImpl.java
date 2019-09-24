package org.futuristic.dilearning.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingImpl implements IGreeting {
    @Override
    public String greeting() {
        return "Hello I was injected through Constructor Injection approach";
    }
}
