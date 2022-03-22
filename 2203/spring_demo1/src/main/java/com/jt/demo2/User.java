package com.jt.demo2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class User {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        context.getBean(Dog.class);
        context.getBean(Dog.class);
        context.getBean(Dog.class);

    }
}
