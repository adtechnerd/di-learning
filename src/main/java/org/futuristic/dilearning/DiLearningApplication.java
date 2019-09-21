package org.futuristic.dilearning;

import org.futuristic.dilearning.my.bean.MyWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiLearningApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiLearningApplication.class, args);
        MyWorld myWrld = (MyWorld) ctx.getBean("myWorld");
        System.out.println("response: " +myWrld.whatIsThis());
    }

}
