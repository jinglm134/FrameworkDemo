package com.example

/**
 * Created by jaylim on 2017/7/19.
 */
internal object Test5 {
    @JvmStatic fun main(args: Array<String>) {
        log("world", printMsg)
    }

    val printMsg = { str: String ->
        println(str)
    }

    val log = { str: String, printLog: (String) -> Unit ->
        printLog(str)
    }
}