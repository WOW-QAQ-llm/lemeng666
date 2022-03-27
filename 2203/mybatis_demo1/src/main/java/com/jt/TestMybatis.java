package com.jt;

import com.jt.mapper.UserMapper;
import com.jt.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * 要求:
 *      1.测试注解的包路径 必须在主启动类的同包及子包中
 *      2.该注解只能在测试方法中使用
 *      3.该注解的作用:启动时会启动spring容器(创建对象),
 *        可以从容器中注入任意对象!!!
 */
@SpringBootTest
public class TestMybatis {

    @Autowired  //按照类型进行的set注入
    private UserMapper userMapper;

    @Test
    public void testFindAll(){
        System.out.println(userMapper.getClass());
        List<User> userList = userMapper.findAll();
        System.out.println(userList);
    }
}

