package com.example.proxy

/**
 *
 * Created by jaylim on 2017/7/24.
 */
object TestProxy {
    @JvmStatic fun main(args: Array<out String>) {
        val serviceImpl = UserServiceImpl()
        val invocationHandler = MyInvocationHandler()
        val bind = invocationHandler.bind(serviceImpl) as Service
        bind.add("jinglm")
    }
}