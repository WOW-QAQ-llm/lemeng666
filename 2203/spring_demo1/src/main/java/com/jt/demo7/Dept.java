package com.jt.demo7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:/dept.properties",encoding="UTF-8")
public class Dept {
    //@Value("101")
    @Value("${dept.id}")
    private Integer id;
    //@Value("财务部")
    @Value("${dept.name}")
    private String name;
     public void hello(){
         System.out.println("获取数据"+id+":"+name);
     }
}
