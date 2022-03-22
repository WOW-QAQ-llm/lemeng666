package com.jt.demo5_di;

public class Car {
    private String name;
    private String color;
    public Car(){
        System.out.println("我是无参构造");
    }
    public Car(String name,String color){
        this.name = name;
        this.color = color;
    }
    public  void go(){
        System.out.println("我可以带你去任何地方"+name+":"+color);
    }
}
