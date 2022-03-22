package com.jt.demo9_lianxi.controller;


import com.jt.demo9_lianxi.pojo.User;
import com.jt.demo9_lianxi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    public void addUser(){
        User user = new User();
        user.setAge(11);
        user.setName("llm");
        user.setSex("男");


        userService.addUser(user);
    }
}
