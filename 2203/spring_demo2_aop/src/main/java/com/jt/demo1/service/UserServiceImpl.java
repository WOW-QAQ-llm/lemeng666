package com.jt.demo1.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public void addUser() {
        System.out.println("创建事务对象2");
        System.out.println("事务开始2");
        System.out.println("新增用户成功!!!");
        System.out.println("事务提交2");

    }
}
