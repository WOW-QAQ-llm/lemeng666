package com.jt.demo4;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //标识配置类
@ComponentScan("com.jt.demo4")//包扫描注解 让注解有效!!
public class SpringConfig {

    //自己手动创建对象,交给Spring容器管理.
    @Bean
    public User user(){
        return new User();
    }
}