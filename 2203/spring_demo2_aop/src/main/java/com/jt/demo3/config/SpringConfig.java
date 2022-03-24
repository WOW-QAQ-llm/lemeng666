package com.jt.demo3.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.jt.demo3")
@EnableAspectJAutoProxy
public class SpringConfig {
}
