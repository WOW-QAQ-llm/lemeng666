package com.jt.demo4;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 第三天课程
 */

public class User {

    //1.对象的创建
    public User(){
        System.out.println("用户对象创建成功!!!");
    }

    //2.进行初始化操作
    @PostConstruct
    public void init(){
        System.out.println("为属性赋值!!!");
    }

    //3.进行业务调用  业务方法 用户手动调用!!!
    public void hello(){
        System.out.println("我爱学java");
    }

    //4.销毁方法
    @PreDestroy
    public void destroy(){
        System.out.println("调用销毁方法,释放资源!!!");
    }
}

