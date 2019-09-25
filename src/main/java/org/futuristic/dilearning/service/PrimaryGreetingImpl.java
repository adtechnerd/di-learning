package org.futuristic.dilearning.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingImpl implements IGreeting {
    @Override
    public String greeting() {
        return "Hello --- Greeting from PrimaryGreetings";
    }
}
