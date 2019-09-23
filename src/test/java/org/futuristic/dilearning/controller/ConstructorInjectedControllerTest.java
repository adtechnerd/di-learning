package org.futuristic.dilearning.controller;

import org.futuristic.dilearning.service.GreetingImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public  void setup() throws Exception {
        constructorInjectedController = new ConstructorInjectedController(new GreetingImpl());
    }

    @Test
    public void greetingTest() {
        Assert.assertEquals(GreetingImpl.SAY_HELLO, constructorInjectedController.sayHello());
    }
}
