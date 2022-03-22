package com.jt.demo8.mapper;

import com.jt.demo8.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserMapperImpl implements UserMapper{
    @Override
    public void addUser(User user) {
        System.out.println("完成用户的入库操作:"+user.getName());

    }
}
