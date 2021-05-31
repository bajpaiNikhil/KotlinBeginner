package com.capgemini.kotlinproject

import java.math.BigInteger

// function - input- number
// calculate factorial and return it

// recursive function
fun factorial(num : Int) : BigInteger {
    val oneFactorial = 1

//    var result = oneFactorial.toBigInteger()
//    for (i in 1..num) {
//
//        result *= i.toBigInteger()
//    }

    //return result
    // n! = n * (n-1)!

    val result = if (num <= 1)
        oneFactorial.toBigInteger()
    else {
        num.toBigInteger() * factorial(num - 1)
    }

    return result
}

// function - input - nullable String
// - remove spaces, make uppercased
// named functions
fun convertString(data: String?) : String{
//   val replaced = data?.replace(" ", "")
//    val converted = replaced?.uppercase()
//
//    return converted ?: ""
    return data?.replace(" ", "")?.uppercase() ?: ""
}

fun main() {
    var fact = factorial(5)
    println("5! = $fact")

    fact = factorial(512)
    println("512! = $fact")

    var str = convertString("John SMith")
    println("Converted: $str")
//    str = convertString(null)
//    println("Converted: $str")

    println("Converted : ${convertString(null)}")

    val factor = { num: Int ->
        var result = 1
        for (i in 1..num){
            result *= i
        }
        result

    } // calculate factorial in lambda

    println("10 ! = ${factor(10)}")

    // lambda expression - number is even?
//    val isEven = {a: Int ->
//        a % 2 == 0
//       // if(a % 2 == 0) true else false
//    }
    val isEven : (Int) -> Boolean = {it % 2 == 0}
    val n = 10
    println("Is $n even?: ${isEven(n)}")
    val num1 = 10
    val num2 = 20
    val result = getOperation(1)(num1,num2)
    print(result)
}

// flag = 1, add
// flag = 2, subtraction
// flag = 3, multiplication
fun getOperation(flag: Int) : (Int, Int) -> Int{
    when(flag){
        1 -> return {a,b ->
            print("Addition: ")
            a+b}
        2 -> return {a,b -> a -b}
        3 -> return {a,b -> a * b}
        else -> return {a,b -> a / b}
    }
}

// kotlin - functional programming - function treated as datatype
// Python, javascript, kotlin, Swift, Dart

// higher order function - int flag
// return mathematical operation as function
//

