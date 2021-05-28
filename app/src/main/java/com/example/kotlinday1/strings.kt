package com.capgemini.kotlinproject

fun main() {
    // escaped String
    val name = "John Smith"

    // raw String
    val address = """
        Jayanagar
        Bangalore
        India
    """.trimIndent()

    val address1 = "Jayanagar\nBangalore\nIndia"

    println("Name : $name")
    println("Address: $address")

    val pincode = 560011
    println(pincode)

    // string interpolation

    // "john smith resides at address with pincode 560011"

    val str1 = name + " resides at address " + address + " with pincode : " + pincode
    println(str1)

    val str2 = "$name resides at address $address with pincode: $pincode"
    println("With interpolation: $str2")

    // string manipulations

    val data = "Hi! Hello! How are you?"

    println("Length: ${data.length}")
    println("First char: ${data.first()}") // {data[0]}
    println("Last char: ${data.last()}") // ${data[data.length - 1]}
    println("Index of last char: ${data.lastIndex}")
    println("is it a question? : ${data.endsWith('?')}")
    println("is string empty: ${data.isEmpty()}")
    println(" is '*' available: ${data.contains('*')}")

    println(" '!' avaiable at index: ${data.indexOf('!')}")
    println("first 5 chars: ${data.substring(0, 5)}")

}