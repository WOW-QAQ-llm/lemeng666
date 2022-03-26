package com.jt.controller;

import com.jt.pojo.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/axios")
@CrossOrigin    //专门解决跨域问题
public class AxiosController {

    /**
     * http://localhost:8080/axios/findStr
     */
    @GetMapping("/findStr")
    public String findStr(){

        return "再坚持半天!!!";
    }
    @GetMapping("/getUserById")
    public String findUserById(Integer id){

        return "获取数据:"+id;
    }
    @GetMapping("/findUser")
    public User findUser(User user){
        return user;
    }


}