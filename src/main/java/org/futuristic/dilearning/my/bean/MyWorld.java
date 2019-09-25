package org.futuristic.dilearning.my.bean;

import org.futuristic.dilearning.service.IGreeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class MyWorld {

    @Autowired
    private IGreeting greeting;

    private String world;

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }

    public String whatIsThis(){
        return greeting.greeting();
    }
}
