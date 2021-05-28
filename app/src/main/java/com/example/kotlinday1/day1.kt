package com.example.kotlinday1

fun main() {
    println("HeheHAHA")
    println("Android studio you stupid")
    println("hello")


    val number = 1_000
    val pi = 3.1428

    val dic = number/ pi
    val rem = number%pi
    val changerem = rem.toInt()
    println("$rem , $changerem")

    val number1 = 1_000 // inferred to Int
    val pi1 = 3.142 // inferred to Double
    val division = number1 / pi1
    val remainder = number1 % pi1
    val intremainder = remainder.toInt()
    println("Division of $number by $pi: $division")
    println("Remainder of division of $number by $pi: $remainder, $intremainder")

    val lattitude = 12.7823262362736273627
    println("Lattitude: ${lattitude.toFloat()}")
    println("=======")

    var counter = 0
    counter ++
    println("$counter")

    val a = 3
    val b =5
    var msg = "$a , $b is ${a+b}"
    println(msg)

}


