package com.example.kotlinday1

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main() {

    val hashMapOfName = hashMapOf<String,String>("name" to "ifnjgh" ,"age" to "20" ,"nationality" to "oiewfnjdgfj")//mapOf is also immutable for mutable use hashmap.

    println(hashMapOfName)

    hashMapOfName.forEach { t, u ->
        println("" + t + u)
    }

    val mutableArrayListOfNames = arrayListOf<String>("fdbvinm","iojfudng","owiengbr") // mutable
    println(mutableArrayListOfNames)

    mutableArrayListOfNames.forEach {
        println(it)
    }

    println("TRADITIONAL FOR LOOOP")

    for(x in 0..10){
        println(x)
    }

    for(x in 0 until 10){
        println(x)
    }
    println()

    for(x in 0 until 10 step 2){
        println(x)
    }
    println()

    for(x in 10 downTo 0 step 2){
        println(x)
    }

}