package org.futuristic.dilearning.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("es")
public class PrimaryGreetingEsImpl implements IGreeting {
    @Override
    public String greeting() {
        return "soy rey";
    }
}
