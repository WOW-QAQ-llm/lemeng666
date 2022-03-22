package com.jt.demo2;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.jt.demo2")
public class SpringConfig {
    @Bean
    @Scope("prototype")//多例对象
   // @Lazy
    public Dog dog(){
        return new Dog();
    }
}
