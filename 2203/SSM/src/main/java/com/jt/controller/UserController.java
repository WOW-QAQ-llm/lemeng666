package com.jt.controller;

import com.jt.pojo.User;
import com.jt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }
    @DeleteMapping("/deleteUserById")
    public void deleteUserById(Integer id){
        userService.deleteUserById(id);
    }
}
