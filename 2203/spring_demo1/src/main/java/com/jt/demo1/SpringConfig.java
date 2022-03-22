package com.jt.demo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  //标识当前类是配置类
@ComponentScan("com.jt.demo1")  //包扫描注解: 让spring注解生效!!!
public class SpringConfig {
    //作用: 和配置文件类似,管理对象!!!

    /**
     * IOC-写法
     *  1.@Bean 告诉Spring容器,当前方法的名称,为Map中的key
     *    返回值是Map中的value.
     *  2.特殊用法:
     *      常规条件下,Spring通过反射实例化对象.
     *      也可以由用户自己new的方式创建
     * @return
     */
    @Bean
    public Dog dogaa(){
        return new Dog();
    }
}