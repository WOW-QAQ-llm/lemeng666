package com.jt;


import com.jt.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestMybatis3 {
        @Autowired
        private UserMapper3 userMapper;
        @Test
        public void TestFindAll(){
                List<User> list = userMapper.findAll();
                System.out.println(list);
        }

}
