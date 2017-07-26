package com.example.proxy.java;

/**
 *
 * Created by jaylim on 2017/7/24.
 */
public class TestProxy {
    public static void main(String args[]) {
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        MyInvocationHandler handler = new MyInvocationHandler();
        Service service = (Service) handler.bind(userServiceImpl);
        service.add();
    }
}