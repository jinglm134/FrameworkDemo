@file:Suppress("UNREACHABLE_CODE")

package com.example

/**
 * Created by jaylim on 2017/7/18
 */
internal object MyClass {
    @JvmStatic fun main(args: Array<String>) {
        (100..150).filter { consoleZhiShu(it) }.forEach { println(it.toString()) }
    }

    fun consoleZhiShu(number: Int?): Boolean {
        if (number == null) {
            return false
        }
        if (number <= 1) {
            return false
        }

        val x: Int = Math.floor(Math.sqrt(number.toDouble())).toInt()
        return (2..x).none { number % it == 0 }
    }
}