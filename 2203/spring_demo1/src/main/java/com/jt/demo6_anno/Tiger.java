package com.jt.demo6_anno;

import org.springframework.stereotype.Component;

@Component
public class Tiger implements Pet{

    @Override
    public void hello() {
        System.out.println("我草，什么东西");
    }
}
