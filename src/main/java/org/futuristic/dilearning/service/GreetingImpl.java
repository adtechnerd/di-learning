package org.futuristic.dilearning.service;

public class GreetingImpl implements IGreeting {

    public static final String SAY_HELLO = "Hello Gyaani!!!";

    @Override
    public String greeting() {
        return SAY_HELLO;
    }
}
