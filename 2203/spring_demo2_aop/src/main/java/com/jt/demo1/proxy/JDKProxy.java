package com.jt.demo1.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy {
    public static Object getProxy(Object target){
        ClassLoader loader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        //创建代理对象

        return Proxy.newProxyInstance(loader,interfaces,null);
    }

    //获取InvocationHandler对象
    public static InvocationHandler getInvocationHandler(Object target){
        //当代理对象执行业务操作时,通过InvocationHandler进行业务的扩展
        return new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("事务开始");
                //调用 让目标方法执行 target:目标对象!!!! 其它都是固定写法!!!
                Object result = method.invoke(target, args);
                System.out.println("事务提交");
                return result;
            }
        };
    }

}
