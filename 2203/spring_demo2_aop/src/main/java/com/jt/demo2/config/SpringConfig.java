package com.jt.demo2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.jt.demo2")
@EnableAspectJAutoProxy //让aop有效
public class SpringConfig {

}
