package com.jt.demo4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUser {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = context.getBean(User.class);
        //调用业务方法
        user.hello();
        //如果需要执行销毁方法,则需要先关闭容器对象
        //思想:销毁动作是敏感行为,特殊处理 实现类中有关闭方法.
        context.close();
    }
}