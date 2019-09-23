package org.futuristic.dilearning.controller;

import org.futuristic.dilearning.service.GreetingImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setup() throws Exception{
        setterInjectedController = new SetterInjectedController();
        GreetingImpl greetingImpl = new GreetingImpl();
        setterInjectedController.setGreeting(greetingImpl);
    }

    @Test
    public void setterInjectedTest(){
        Assert.assertEquals(GreetingImpl.SAY_HELLO, setterInjectedController.sayHello());
    }
}
