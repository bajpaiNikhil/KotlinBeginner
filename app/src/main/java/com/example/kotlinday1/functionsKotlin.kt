package com.example.kotlinday1

fun main() {
    println(getName())
    println(square(5))
    println(square1(5))
}

fun getName():String {
    return "HEHEHAHA"
}

fun square(number: Int):Int{
    return  number * number
}
fun square1(number : Int) = number * number


/* type of arguments
*  1. Positional Argument
*  2. Default "
*  3. Named arguments
* */