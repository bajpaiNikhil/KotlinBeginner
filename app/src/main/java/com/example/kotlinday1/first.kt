package com.capgemini.kotlinproject


fun main() {
    println("Hello World!")
    println("Kotlin is multi platform language.")

    // var - mutable - read and write
    var username = "Shridevi"
    username = "Shridevi Sawant"

    var city : String
    // Java- String city

    println(username)
    city = "Bangalore"

    println("Address: $city") // string interpolation

    // val - immutable - readonly
    val pincode = 560011
    // final int pincode = 560011 - Java

    println("Pincode: $pincode")

    // numbers

    val number = 1_000 // inferred to Int
    val pi = 3.142 // inferred to Double

    val division = number / pi
    val remainder = number % pi

    val intRemainder = remainder.toInt()

    println("Division of $number by $pi: $division")
    println("Remainder of division of $number by $pi: $intRemainder")

    val lattitude = 12.7823262362736273627

    println("Lattitude: ${lattitude.toFloat()}")

    var counter = 0
    counter++
    counter += 10 // counter = counter + 10
    println("Counter: $counter")

    val letter = 'A'
    println("letter: $letter, ASCII num: ${letter.code}")

    val num = 66
    println("Char : ${num.toChar()}")

    val isComplete = false

    println("is Completed: ${!isComplete}")

    print("=======")


}