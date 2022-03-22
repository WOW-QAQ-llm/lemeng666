package com.jt.demo9_lianxi.service;

import com.jt.demo9_lianxi.mapper.UserMapper;
import com.jt.demo9_lianxi.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicrImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }
}
