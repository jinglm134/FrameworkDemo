@file:Suppress("VARIABLE_WITH_REDUNDANT_INITIALIZER")

package com.example

/**
 * Created by jaylim on 2017/7/19.
 */
internal object Test6 {
    @JvmStatic fun main(args: Array<String>) {
        var wifiPassword = "?"
        val a = arrayOf("0", "1", "2", "6", "7", "h", "j")
        wifiPassword = arrayOf(5, 9, 6, 8, 2, 7, 0, 1, 4, 0, 3)
                .filter { it in 0 until a.size }
                .map { a[it] }
                .reduce { s1, s2 -> "$s1$s2" }
        print(wifiPassword)
    }
}