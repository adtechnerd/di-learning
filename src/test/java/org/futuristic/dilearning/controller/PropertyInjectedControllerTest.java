package org.futuristic.dilearning.controller;

import org.futuristic.dilearning.service.GreetingImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setup() throws Exception{
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingImpl = new GreetingImpl();
    }

    @Test
    public void testPropertyInjectedTest(){
        Assert.assertEquals(GreetingImpl.SAY_HELLO, propertyInjectedController.sayHello());
    }
}
