package com.example.proxy.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by jaylim on 2017/7/24.
 */

public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public Object bind(Object tar) {
        this.target = tar;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method + " is prepared excute!");
        Object invoke = method.invoke(target, args);
        System.out.println(method + " is already excuted!");
        return invoke;
    }

}
