package com.example.kotlinday1

import java.math.BigInteger

//function --input as number
// calculate factorial return it

// 2 . function - input - nullable String
// 2 . remove spcae make uppercased

fun main() {
    println(factorial(20))
    println(removalNullString("ajksdhhu hdwbfipqwxb ipuwqg iquf"))

    println("Eevn or odd")

    val EvenOdd = { a: Int ->
        if (a%2==0){
            print("EVEN")
        }else{
            print("ODD")
        }
    }
    EvenOdd(10)


    var num = 10
    while (num!= 0) {
        println("num is  : ${num}")
//        val op = makeZero(num)
//        num = op(num)
        num = makeZero(num)(num)
    }
}


//higher order function - int Flag
//return mathematical operation as a function
//flag==1 add
//flag==2 substraction
//flag== 3 multiply













fun incremetByOne(num : Int) = num +1

fun decrementByOne(num :Int) = num - 1

//higher Order Function

fun makeZero(num:Int ) : (Int) -> Int{
    if(num > 0)
        return ::decrementByOne
    else
        return ::incremetByOne

}

fun factorial(a:Int):BigInteger{
    var result = 1
    var factorail1 = result.toBigInteger()
    for(i in 2..a){
        factorail1 *= i.toBigInteger()
    }
    return factorail1
}

fun removalNullString( b : String?):String{

    val result = b ?.uppercase()?.replace(" ","") ?: "null string."
    return result
}




























