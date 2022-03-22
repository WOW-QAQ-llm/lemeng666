package com.jt.demo5_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

    public static void main(String[] args) {
        String resource = "spring_di.xml";
        ApplicationContext context =
                new ClassPathXmlApplicationContext(resource);
        Person person = context.getBean(Person.class);
        person.sayHi();
        //调用car对象的方法
        person.toGo();
    }
}
