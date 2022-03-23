package com.jt.demo1;

import com.jt.demo1.config.SpringConfig;
import com.jt.demo1.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestTX {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean(UserService.class);
         userService.addUser();
    }
}
