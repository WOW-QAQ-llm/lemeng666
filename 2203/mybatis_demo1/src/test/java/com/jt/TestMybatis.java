package com.jt;

import com.jt.mapper.UserMapper;
import com.jt.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @Test
    public void testInsert(){
        User user = new User();
        user.setId(100).setName("111").setSex("男").setAge(11);
        userMapper.saveUser(user);
        int rows = userMapper.saveUser2(user);
        System.out.println("影响的行数:"+rows);
    }
    @Test
    public void testUpdate(){
        User user = new User();
        user.setId(232).setName("清明节");
        userMapper.updateUserById(user);
    }
    @Test
    public void testDelete(){
        User user = new User();
        user.setId(232).setName("清明节");
        userMapper.deleteUserById(user);
    }
    @Test
    public void testFindByMap(){
        Map map = new HashMap();
        map.put("minAge", 18);
        map.put("maxAge", 100);
        List<User> list = userMapper.findUserByMap(map);

        System.out.println(list);
    }
}

