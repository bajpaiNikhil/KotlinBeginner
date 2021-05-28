package com.capgemini.kotlinproject

fun main() {

    val num1 = 10

    // is it even?

    // if - as statement - no return value
    // else - optional
    if (num1 % 2 == 0) {
        println("$num1 is even")
    }
             println("------")
//    else
//        println("$num1 is ODD")


    // if - as expression - return value
    // else is mandatory
        val num2 = 20
    // ternaray operator - num1 > num2 ? num1 : num2

    val max = if ( num1 > num2) num1 else num2 // no ternary operator in Kotlin
    println("Max: $max")

    var maxNum : Int
    maxNum = if (num1 > num2){
        println("$num1 is bigger than $num2")
        num1
    } else {
        println("$num2 is bigger than $num1")
        num2
    }
    println("Max Num: $maxNum")

    // when - replacement  for switch- case

    var marks : Any = 30

    when(marks){
        is String -> println("invalid marks")
        100 -> println("EXCELLENT")
        in 75..99 -> { println("Distinction")}
        in 65..74 -> println("First class")
        in 55..64 -> println("Second class")
        in 35..54 -> println("Third class")

        else -> {
            println("None of the branches matched")
            println("Failed")
        }
    }

    // chain if-else -> when
    /*
        if (condition1)
            else if(condition2)
                else if(condition 3)
     */

    marks = -10
    when {

        marks !is Int -> println("Invalid marks")
        marks !in 0..100 -> println("Marks should be between 0 to 100")
        marks == 100 -> println("EXCELLENT")
        marks in 75..99 -> println("Distinction")
        marks < 35 -> println("failed")

        else -> {
            println("marks: $marks")
        }

    }

    val str1 = "HELLO"
    val str2 = "hello"
    val str3 = str2.uppercase()

    println("str3 : $str3, str1 : $str1")

    // '==' compares values
    // '===' compares references
    if (str3 === str1){
        println("Same")
    }else
        println("Different")

    println("--DONE--")
}