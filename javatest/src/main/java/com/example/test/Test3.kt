package com.example.test

/**
 *
 * Created by jaylim on 2017/7/19.
 */
internal object Test3 {
    @JvmStatic fun main(args: Array<String>) {

        val firstName: String = "Tao"
        val lastName: String? = "Zhang"

        println("my name is ${getName(firstName, lastName)}")

    }

    fun hasEmpty(vararg strArray: String?): Boolean {
        for (str in strArray) {
            str ?: return true
        }
        return false
    }

    fun getName(firstName: String?, lastName: String? = "unknow"): String {
        if (hasEmpty(firstName, lastName)) {
            lastName?.let { return@getName "${checkName(firstName)} $lastName" }
            firstName?.let { return@getName "$firstName ${checkName(lastName)}" }
        }
        return "$firstName $lastName"
    }

    fun checkName(name: String?): String = name ?: "unknow"

}
