package com.capgemini.kotlinproject

//import com.capgemini.kotlinproject.demo.PI
//import com.capgemini.kotlinproject.demo.calculate

import com.capgemini.kotlinproject.example.calculate as multiply
import com.capgemini.kotlinproject.demo.calculate as sum
import com.capgemini.kotlinproject.demo.PI
import java.util.*


fun main() {

    val area = PI * 10
    println("Area: $area")

    var result : Int
//    var result = calculate(10)
//    println("Square Result: $result")

    result = sum(10, 20)
    println("Sum result: $result")

    result = multiply(10 ,5)
    println("Result: $result")

    val data = listOf(1,2,3)
    val t = Calendar.getInstance().time.toString()
    println("Current time: $t")
}