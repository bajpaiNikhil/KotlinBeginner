package com.capgemini.kotlinproject


fun main() {

    val numRange = 1..10

    println("number range: $numRange - ${numRange.toList()}")

    val charRange = 'a'.rangeTo('z') // 'a'..'z'

    println("Char range: $charRange")

    val num = 10
    val isAvailable = num in numRange
    println("is $num available: $isAvailable")

    val oddNums = numRange.step(2)
    println("ODD nums: ${oddNums.toList()}")

    val reversed = numRange.reversed()
    println("Reversed: ${reversed.toList()}")

    val tenToOne = 10.downTo(1)
    println("downward range: ${tenToOne.toList()}")

    // even numbers between 0 to 20
   var evenRange = 0.rangeTo(20).step(2)


    evenRange = 0..20 step 2 // step - infix function
    println("Even : ${evenRange.toList()}")

    val strRAnge = 10.rangeTo(20)
    println(strRAnge)
}