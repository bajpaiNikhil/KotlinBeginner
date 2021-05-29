@file:JvmName("greet")

package com.example.kotlinday1

import java.util.*

fun greeter(name : String): String{
    val cal = Calendar.getInstance()
    if (cal.get(Calendar.HOUR_OF_DAY) < 12 ){
        return "GOOD MORNING : $name"
    }
    if (cal.get(Calendar.HOUR_OF_DAY) < 18 ){
        return "GOOD AFTERNOON : $name"
    }
    return "HEHEHAHAHAHA   SLEEP"
}