package com.example.proxy

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy

@Suppress("UNREACHABLE_CODE")
/**
 *
 * Created by jaylim on 2017/7/24.
 */
internal class MyInvocationHandler : InvocationHandler {


    private lateinit var target: Any

    fun bind(tar: Any): Any {
        this.target = tar
        return Proxy.newProxyInstance(target.javaClass.classLoader, target.javaClass.interfaces, this)
    }

    override fun invoke(p0: Any?, p1: Method?, p2: Array<out Any>?): Any {
        println("$p1 is prepared excute!")
        val invoke = p1!!.invoke(target, p2)
        println("$p1 is already excuted!")
        return invoke
    }
}