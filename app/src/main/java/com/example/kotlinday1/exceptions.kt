package com.example.kotlinday1

import com.example.kotlinday1.demo.num1

import java.lang.ArithmeticException
import java.lang.Exception
import java.lang.NumberFormatException

class HTTPExecption(msg: String, val code: Int) : Exception (msg){
    fun showDetails(){
        println("Message: $message, HTTPcode: $code")
    }
}

fun downloadData(){
    // code to do HTTP communicatiion
    val responseCode = 404

    when(responseCode){
        200 -> println("Success")
        404 -> throw HTTPExecption("File not Found", 404)
        500 -> throw HTTPExecption("Server Error", 500)
        else -> throw HTTPExecption("Unknown Error", responseCode)
    }
}

fun main() {

    try {
        downloadData()
    }catch (e: HTTPExecption){
        e.showDetails()
    }


    val num1 = 10
    var result = num1.divideBy(0)
    println("Divivsion: $result")

    val num2 = getNumber("100gt")
    println("Converted: $num2")
    printData()
}

fun printData(){
    val arr = IntArray(5)
    arr[2] = 10
    println("arr: ${arr.contentToString()}")
    try {
        for (i in arr.indices) {
            val div = 100 / arr[i + 1]
            println("Division: $div")
        }
    }catch (e: ArithmeticException){
        println("Division: Infinity")
    }catch (e: ArrayIndexOutOfBoundsException){
        println("Ivalid Index")
    }catch (e: Exception){
        println("Unknown Error: $e")
    }
}

fun getNumber(str: String): Int{
    val rest = try {
        str.toInt()
    }catch (e: NumberFormatException){
        println("String should have only numbers")
        0
    }finally { // always executed
        println("Finally executed")
    }
    return rest
}


fun Int.divideBy(num : Int): Int{
    try {
        return this / num
    } catch (e : ArithmeticException){
        println("ERROR")
    }
    return 0
}
