package org.futuristic.dilearning.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("en")
public class PrimaryGreetingImpl implements IGreeting {
    @Override
    public String greeting() {
        return "Hello --- Greeting from PrimaryGreetings";
    }
}
