package com.jt.demo8.controller;

import com.jt.demo8.pojo.User;
import com.jt.demo8.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    public void addUser(){
        User user = new User();
        user.setAge(18);
        user.setId(111);
        user.setName("李乐猛");
        user.setSex("男");

        userService.addUser(user);
    }

}
