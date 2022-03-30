package com.jt;

import com.jt.mapper.UserMapper2;
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
}



