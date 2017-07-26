package com.example.proxy.java;

/**
 *
 * Created by jaylim on 2017/7/24.
 */

public class UserServiceImpl implements Service{
    @Override
    public void add() {
        System.out.println("this is a add method in service");
    }
}
