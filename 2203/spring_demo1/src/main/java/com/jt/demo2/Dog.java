package com.jt.demo2;

public class Dog implements Pet{
    public Dog(){
        System.out.println("我是无参构造");
    }
    @Override
    public void hello() {
        System.out.println("小狗汪汪汪");
    }
}
