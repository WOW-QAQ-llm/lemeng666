package com.jt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {
    @RequestMapping("/user/findUser")
    @ResponseBody
    public String findUser(HttpServletRequest request,
                           HttpServletResponse response){ //request和response是servlet的两个对象
        String id = request.getParameter("id");
        int intId = Integer.parseInt(id);//string类型转为int类型
        String name = request.getParameter("name");
        return intId+":"+name;

    }
    @RequestMapping("/user/findUser2")
    @ResponseBody
    //http://localhost:8080/user/findUser2?id=10011&name=tom1
    public String findUser2(Integer id,String name){ //request和response是servlet的两个对象

        return id+":"+name;

    }
    //SpringMVC在内部将Servlet的取值的方式包装.用户只需填写参数
    //即可以获取数据.
}
