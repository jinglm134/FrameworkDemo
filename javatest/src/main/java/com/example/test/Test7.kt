package com.example.test

import java.math.BigInteger

/**
 * 尾递归
 * Created by jaylim on 2017/7/24.
 */
class Test7(var value: BigInteger = BigInteger.valueOf(1L))

tailrec fun factorial(num: Int, test: Test7) {
    if (num > 1) {
        test.value = test.value.times(BigInteger.valueOf(num.toLong()))
        factorial(num - 1, test)
    }
}

fun main(args: Array<String>) {
    val test = Test7()
    factorial(50000, test)
    println(test.value)
}