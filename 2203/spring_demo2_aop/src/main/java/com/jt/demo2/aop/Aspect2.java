package com.jt.demo2.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(value = 2)
public class Aspect2 {
    @Around("@annotation(com.jt.demo2.anno.TX)")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知开始2");
        Object result = proceedingJoinPoint.proceed();
        System.out.println("环绕通知结束2");
        return result;
    }
}
