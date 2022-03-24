package com.jt.demo2.service;

import com.jt.demo2.anno.TX;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @TX
    @Override
    public void addUser() {
        System.out.println("新增用户成功!!!");
    }
}
