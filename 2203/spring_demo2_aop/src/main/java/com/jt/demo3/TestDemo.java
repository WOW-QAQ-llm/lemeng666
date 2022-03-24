package com.jt.demo3;

import com.jt.demo3.config.SpringConfig;
import com.jt.demo3.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDemo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        PersonService personService = context.getBean(PersonService.class);
        String personName = personService.getPersonName();
        System.out.println(personName);
    }
}
