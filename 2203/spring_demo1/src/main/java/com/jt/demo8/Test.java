package com.jt.demo8;

import com.jt.demo8.config.SpringConfig;
import com.jt.demo8.controller.UserController;
import com.jt.demo8.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
         UserController userController= context.getBean(UserController.class);
            userController.addUser();
    }
}
