package com.jt.controller;

import com.jt.pojo.User;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/result/{id}/{name}/{age}")
    public User restful(User user){
        return user;
    }
    /**
     * 编辑后端Controller
     * URL: /axios/saveUser
     * 参数: json串
     *      {"id":100,"name":"tomcat猫","age":20}
     * 返回值: User
     * 难点:
     *      1.将JSON串转化为Java对象  @RequestBody
     *      2.将Java对象转化为JSON串! @ResponseBody
     */
    @PostMapping("/saveUser")
    public User saveUser(@RequestBody User user){
        return user;
    }


}