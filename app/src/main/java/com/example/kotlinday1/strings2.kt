package com.capgemini.kotlinproject

fun main() {

    val str1 = "Hi! Hello! How are you?"

    // split string

    val splits = str1.split( '!')
    println("Splitted: $splits")

    // convert to lowercase
    val lowered  = str1.lowercase()

    println("Original string: $str1")
    println("Lower cased: $lowered")
    println("Capitalized: ${lowered.capitalize()}")

    val uppered = str1.uppercase()
    println("Uppered: $uppered")

    // replacement
    val replaced = str1.replace('!', '*')

    println("Replaced: $replaced")

    val address = """
        Jayanagar
        Bangalore
        India
    """.trimIndent()

    println("Address: $address")
    println("No. of lines: ${address.lines().size}")
    println("Lines: ${address.lines()}")

    val data1 = """Hello"""
    val data2 = """Hello"""

    println("Comparision: ${data1.compareTo(data2)}")


    if (data1 == data2){
        println("Same")
    }

    var result = data1 + data2
    println(result)

    result = "$data1 $data2"
    println(result)

    var data = "abcde" // reference to string stored
    data = "xyz" // reference got changed, not the value

    println(data)


}