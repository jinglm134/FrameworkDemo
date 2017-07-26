package com.example.test

internal object Test1 {
    @JvmStatic fun main(args: Array<out String>) {
        (151..999).filter { console(it) }.forEach { println(it.toString()) }
    }

    /*题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个"水仙花数"，
    因为153=1的三次方＋5的三次方＋3的三次方。
    程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。*/

    private fun console(num: Int): Boolean {
        if (num < 100) return false
        val sum: Int = Math.pow((num / 100).toDouble(), 3.0).toInt() +
                Math.pow((num / 10 % 10).toDouble(), 3.0).toInt() +
                Math.pow((num % 10).toDouble(), 3.0).toInt()
        if (sum == num) return true
        return false

    }
}