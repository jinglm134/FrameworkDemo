package com.example.proxy

@Suppress("UNREACHABLE_CODE")
/**
 *
 * Created by jaylim on 2017/7/24.
 */
class UserServiceImpl : Service {
    override fun add(str: String) {
        println("this is a add method in service____ $str")
    }
}