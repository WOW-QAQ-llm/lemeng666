package com.jt;

import com.jt.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestMybatis2 {

    @Autowired
    private UserMapper2 userMapper;
    @Test
    public void testFindUser(){
        User user = new User();
        user.setAge(3000).setSex("男");
        List<User> list = userMapper.findUser(user);
        System.out.println(list);
    }
    @Test
    public void testUpdateUser(){
        User user = new User();
        user.setId(5).setName("llm").setAge(1000);
        userMapper.updateUser(user);
        System.out.println("修改成功");
    }
    @Test
    public void testfindUserChoose(){
        User user = new User();
        user.setAge(18).setSex("男");
        List<User> list = userMapper.findUserChoose(user);
        System.out.println(list);
    }
}



