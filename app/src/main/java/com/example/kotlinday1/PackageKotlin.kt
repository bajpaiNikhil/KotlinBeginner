package com.example.kotlinday1

import com.example.kotlinday1.demo.calcualte as multiply
import com.example.kotlinday1.demo.num1

import com.example.kotlinday1.example.calcualte  as sum

fun main() {
    val area = num1*10
    println("AREA : $area")


//    var result = calculateSquare(10)
//    println(result)

    var summing = multiply(10,10)
    println(summing)
    
    var result = sum(23,2)
    println(result)
}