package com.jt.demo1.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class TimeProxy {
    public static Object  getProxy(Object target){
        ClassLoader loader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                long startTime = System.currentTimeMillis();
                Object result = method.invoke(target, args);
                long endTime = System.currentTimeMillis();
                System.out.println(endTime-startTime+"毫秒");
                return result;
            }
        };
        //创建代理对象

        return Proxy.newProxyInstance(loader,interfaces,handler);
    }
}
