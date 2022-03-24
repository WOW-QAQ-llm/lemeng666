package com.jt.demo3.service;

import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService{

    @Override

    public String getPersonName() {
        System.out.println("目标方法已创建");
        int a = 1/0;
        return "五福集齐";
    }
}
