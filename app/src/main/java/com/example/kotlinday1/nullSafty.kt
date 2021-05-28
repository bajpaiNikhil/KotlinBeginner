package com.example.kotlinday1

fun main() {
    var str : String? = null

    if( str != null){
        println(str.length)
    }else{
        println("NULL Strinog")
    }

    // safe-call operator ?.
    var length = str ?.length
    println(length)
    //elvis operator

    length = str ?.length ?: 0
    print(length)

    // assestion operator !!
    //val x : String = str ?: ""
    val x = str!! // unwrapping of nullable reference - change of npe
    println(x)

}