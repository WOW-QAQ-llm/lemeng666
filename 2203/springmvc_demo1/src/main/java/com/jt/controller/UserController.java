package com.jt.controller;

import com.jt.pojo.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@RequestMapping("/user")
@RestController
public class UserController {
    @RequestMapping("/findUser")
    public String findUser(HttpServletRequest request,
                           HttpServletResponse response){ //request和response是servlet的两个对象
        String id = request.getParameter("id");
        int intId = Integer.parseInt(id);//string类型转为int类型
        String name = request.getParameter("name");
        return intId+":"+name;

    }
    //SpringMVC在内部将Servlet的取值的方式包装.用户只需填写参数
    //即可以获取数据.
    @RequestMapping("/findUser2")
    //http://localhost:8080/user/findUser2?id=10011&name=tom1
    public String findUser2(Integer id,String name){
        //request和response是servlet的两个对象
        return id+":"+name;

    }
    //http://localhost:8080/user/getUser?id=1&name=李四&age=18
    @RequestMapping("/getUser")
    public User getUser(User user){
        return user;
    }
    /**
     * RestFul结构 动态接收参数
     * url: http://localhost:8080/user/restFul/1/张三
     * 返回值: 返回User对象
     * 难点: 需要从URL的路径中获取参数!!!
     * 语法:
     *  1.服务器端参数接收时,变量使用{xx}进行包裹,并且位置固定.
     *  2.利用@PathVariable注解,动态获取路径中的数据,要求名称必须匹配
     */
    @RequestMapping("/restFul/{id}/{name}")
    public User restFul(@PathVariable Integer id,
                        @PathVariable String name){
        User user = new User();
        user.setId(id);
        user.setName(name);
        return user;
    }
    @RequestMapping("/restFul2/{id}/{name}/{age}")
    public User restFul2(User user){

        return user;
    }

}
