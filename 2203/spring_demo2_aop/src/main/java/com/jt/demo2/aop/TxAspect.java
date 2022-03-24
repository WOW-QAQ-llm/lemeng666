package com.jt.demo2.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect //当前类是一个切面
@Order(value = 1 )
public class TxAspect {
    //编码:  切面 = 切入点表达式 + 通知方法
    //@Pointcut("bean(userServiceImpl)") //切入点表达式
    //@Pointcut("within(com.jt.demo2.service.*)") //切入点表达式
    //要求: 拦截service.包下的所有的类,任意方法, 任意参数  返回值类型任意!!
    //@Pointcut("execution(* com.jt.demo2.service..*.*(..))")
    @Pointcut("@annotation(com.jt.demo2.anno.TX)")
    public void pointCut(){

    }
//    @Before("pointCut()") //通知方法
//    public void before(JoinPoint joinPoint){
//        //1.获取目标对象的类型
//        Class targetClass = joinPoint.getTarget().getClass();
//        //2.获取目标对象名称
//        String targetName = joinPoint.getSignature().getDeclaringTypeName();
//        //3.获取目标方法的名称
//        String methodName = joinPoint.getSignature().getName();
//        //4.获取参数数据
//        Object[] args = joinPoint.getArgs();
//        System.out.println("目标对象类型:"+targetClass);
//        System.out.println("目标对象名称:"+targetName);
//        System.out.println("目标方法名称:"+methodName);
//        System.out.println("参数名称:"+ Arrays.toString(args));
//    }
//    @AfterReturning(value = "pointCut()",returning = "result")
//    public void afterReturning(Object result){
//        System.out.println("返回值"+result);
//    }
//    @AfterThrowing(value = "pointCut()",throwing  = "exception")
//    public void afterThrowing(JoinPoint joinPoint,Exception exception){
//        System.out.println("抛出异常"+exception.getMessage());
//    }
//    @After("pointCut()")
//    public void after(){
//        System.out.println("我是最终通知!!");
//    }
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
