package com.jt.demo9_lianxi;


import com.jt.demo9_lianxi.config.SpringConfig;
import com.jt.demo9_lianxi.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMVC {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        UserController userController = context.getBean(UserController.class);
            userController.addUser();
    }


}

