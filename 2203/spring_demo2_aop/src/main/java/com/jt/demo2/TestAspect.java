package com.jt.demo2;

import com.jt.demo2.config.SpringConfig;
import com.jt.demo2.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAspect {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean(UserService.class);
        System.out.println(userService.getClass());
        //userService.addUser();
        userService.findName();
    }
}
