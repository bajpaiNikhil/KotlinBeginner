package com.example.kotlinday1

fun main() {
    val a = 3
    val b =5
    val msg = "$a , $b is ${a+b}"
    println("$msg")

    //escaped String
    val name = "dijfudhfbvaob"
    //Raw String
    val address = """
        fjivdnijvn
        ijdnadvjn
        idjnapidn
    """.trimIndent()

    val address1  = "fdhvbadhfv\njfdhvbASHUVBAH\nASUHDVADHV"
    println(address1)

    println("NAME:  $name ")
    println("Address :  $address")


    val num = 560011
    println(name + " resides at " + address + "  with pincode " + num)

    println("$name reside at address $address with pincode : $num")

    val data = "Android studio you fool waste of space ?"
    println("Length : ${data.length}")
    println("First char : ${data[0]}")
    println("last char : ${data.last()}")
    println("is it a question : ${data.endsWith("?")}")
    println("is '!' available  : ${data.contains('!')}")
    println("index of '?' : ${data.indexOf('?')}" )

    val str1 =  "hi my name is ! wont tell"
    val strsplit = str1.split('!')
    println(strsplit)

    val struper = str1.uppercase()
    println(struper)

    val data1 = "hell"
    val data2 = "hello"

    println("Comparision : ${data1.compareTo(data2)}")

    var data3124 = "abcf" //reference to string stored
    data3124 = "vvnsdjfn" // reference got changed not the value.
    print(data3124)


}

