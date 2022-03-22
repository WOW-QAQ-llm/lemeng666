package com.jt.demo6_anno;

import org.springframework.stereotype.Component;

@Component
public class Pig implements Pet{
    @Override
    public void hello() {
        System.out.println("你是一头猪");
    }
}
