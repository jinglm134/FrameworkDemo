package com.example

/**
 * Created by jaylim on 2017/7/19.
 */
internal object Test4 {
    var num: Int = 0
    @JvmStatic fun main(args: Array<out String>) {
        print(jieChen(5).toString())
    }

    fun jieChen(n: Int): Int {
        this.num = n
        var sum = 1
        fun compeat(): Unit {
            sum *= num
            num--
            if (num > 1) {
                compeat()
            }
        }
        compeat()
        return sum
    }
}