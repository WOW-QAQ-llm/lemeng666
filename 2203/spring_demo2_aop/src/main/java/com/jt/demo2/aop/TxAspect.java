package com.jt.demo2.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Aspect //当前类是一个切面
public class TxAspect {
    //编码:  切面 = 切入点表达式 + 通知方法
    //@Pointcut("bean(userServiceImpl)") //切入点表达式
    //@Pointcut("within(com.jt.demo2.service.*)") //切入点表达式
    //要求: 拦截service.包下的所有的类,任意方法, 任意参数  返回值类型任意!!
    //@Pointcut("execution(* com.jt.demo2.service..*.*(..))")
    @Pointcut("@annotation(com.jt.demo2.anno.TX)")
    public void pointCut(){

    }
    @Before("pointCut()") //通知方法
    public void before(){
        System.out.println("AOP前置通知");
    }
    @AfterReturning("pointCut()")
    public void afterReturning(){
        System.out.println("AOP后置通知");
    }
    @AfterThrowing("pointCut()")
    public void afterThrowing(){
        System.out.println("抛出异常");
    }
    @After("pointCut()")
    public void after(){
        System.out.println("我是最终通知!!");
    }
    /**
     * 注意事项: 环绕通知中必须添加参数,并且必须位于第一位
     * 用法:
     *  Proceed with the next advice or target method invocation
     *  1.如果有下一个通知,则执行下一个通知,
     *  2.如果没有下一个通知则执行目标方法
     * @return
     */
    @Around("pointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕通知开始");
        Object result = joinPoint.proceed();
        System.out.println("环绕通知结束");
        return result;
    }
}
