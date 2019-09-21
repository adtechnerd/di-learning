package org.futuristic.dilearning.my.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class MyWorld {
    private String world;

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }

    public String whatIsThis(){
        return "MY WORLD";
    }
}
