package com.jt.demo3.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DemoAspect {
    //匹配了切入点表达式，为其创建代理对象 jdk动态代理
    @Around("bean(personServiceImpl)")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println("耗时："+(end-start));
        Class targetClass = joinPoint.getTarget().getClass();
        String typeName = joinPoint.getSignature().getDeclaringTypeName();
        String name = joinPoint.getSignature().getName();
        System.out.println(targetClass);
        System.out.println(typeName);
        System.out.println(name);
        return result;
    }
    @AfterThrowing(value = "execution(* com.jt.demo3.service..*.*(..))"
            ,throwing = "exception")
    public void afterThrowing(Exception exception){
        exception.printStackTrace();
        System.out.println("抛出异常"+exception.getMessage());
    }
}
