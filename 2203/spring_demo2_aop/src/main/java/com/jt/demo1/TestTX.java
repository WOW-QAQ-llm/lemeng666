package com.jt.demo1;

import com.jt.demo1.config.SpringConfig;
import com.jt.demo1.proxy.JDKProxy;
import com.jt.demo1.proxy.TimeProxy;
import com.jt.demo1.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestTX {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService target = context.getBean(UserService.class);
        System.out.println(target.getClass());
        UserService proxy = (UserService) JDKProxy.getProxy(target);
        System.out.println("打印代理对象类型:"+proxy.getClass());
        proxy.addUser();
        UserService proxy1 = (UserService) TimeProxy.getProxy(target);
        System.out.println("打印代理对象类型:"+proxy1.getClass());
        proxy1.addUser();

    }
}
