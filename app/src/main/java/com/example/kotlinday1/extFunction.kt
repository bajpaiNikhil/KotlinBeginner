package com.example.kotlinday1

fun main() {
    val x = 10
    println(x.even())


}

fun Int.even(): Boolean {
    if (this %2 ==0) {
        return true
    }else
        return false
}