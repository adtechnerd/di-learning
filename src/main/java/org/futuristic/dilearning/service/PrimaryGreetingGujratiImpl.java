package org.futuristic.dilearning.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"gu", "default"})
public class PrimaryGreetingGujratiImpl implements IGreeting {
    @Override
    public String greeting() {
        return "હું ભગવાન છું";
    }
}
