package org.futuristic.dilearning;

import org.futuristic.dilearning.controller.ConstructorInjectedController;
import org.futuristic.dilearning.controller.PropertyInjectedController;
import org.futuristic.dilearning.controller.SetterInjectedController;
import org.futuristic.dilearning.my.bean.MyWorld;
import org.futuristic.dilearning.service.GreetingImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiLearningApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiLearningApplication.class, args);
        MyWorld myWrld = (MyWorld) ctx.getBean("myWorld");
        System.out.println("response: " +myWrld.whatIsThis());

        PropertyInjectedController propertyInjectedController = ctx.getBean(PropertyInjectedController.class);
        System.out.println(propertyInjectedController.sayHello());

        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());

        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }

}
