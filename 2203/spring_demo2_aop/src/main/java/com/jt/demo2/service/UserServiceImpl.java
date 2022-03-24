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

    @Override
    @TX
    public String findName() {
        System.out.println("春节愉快");
        return "春节愉快";
    }


}
