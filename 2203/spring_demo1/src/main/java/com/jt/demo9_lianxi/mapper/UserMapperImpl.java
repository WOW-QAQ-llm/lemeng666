package com.jt.demo9_lianxi.mapper;


import com.jt.demo9_lianxi.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserMapperImpl implements UserMapper{
    @Override
    public void addUser(User user) {
        System.out.println("数据传输内容是:"+user.getSex()+user.getAge());
    }
}
