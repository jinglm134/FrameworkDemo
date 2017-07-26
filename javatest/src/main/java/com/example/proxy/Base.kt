package com.example.proxy

import kotlin.properties.Delegates

/**
 *
 * Created by jaylim on 2017/7/25.
 */
interface Base {
    fun display()
}

/**
 * 被代理类
 */
open class BaseImpl : Base {
    override fun display() = println("just display me.")
}

/**
 * 代理类，使用:以及关键词by进行声明
 * 许代理属性和其他继承属性共用
 * class Drived(base: Base) : Base by base,BaseImpl()
 */
class Drived(base: Base) : Base by base

//使用
fun show() {
    val b = BaseImpl()
    val drived = Drived(b)
    drived.display()

}

class Water {
    var weight: Int by Delegates.notNull()

    val name: String by lazy {
        println("LAZY............")
        "android_proxy"
    }

    var value: String by Delegates.observable("init value") {
        d, old, new ->
        println("$d ___$old ___$new")
    }
}


fun main(args: Array<String>) {
    show()
    val water = Water()
    println(water.name)
    println(water.name)
    println(water.value)
    water.value = "11111111"
    println(water.value)
    water.value = "22222222"
    println(water.value)
    water.value = "33333333"
    println(water.value)
    water.weight = 20
    println(water.weight)


}

val String.lastChar: Char
    get() = this[this.length - 1]

class A(val p: Int)
