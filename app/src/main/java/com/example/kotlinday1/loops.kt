package com.capgemini.kotlinproject

fun main() {

    // for - iterating over collection

    val data = arrayOf(10,20,30,40,50,60,70,80,90,100)

    for ( element in data){
        println("Element: $element")
    }

    for (i in data.indices){
        println("Element at index $i: ${data[i]}")
    }

    println("WithIndex....")
    for ((i, e) in data.withIndex()){
        println("Element at index $i: $e")
    }

    for (counter in 1..5){
        println("Hello")
    }

    // print square of even numbers between 0 to 10
    for (num in (0..10).step(2)){
        println("Square of $num : ${num * num}")
    }

    //nested for loop
    // table of 27 to 32
    for (num in 27..32){
        println("--Table of $num ---")
        for (multiplier in 1..10){
            println(num * multiplier)
        }
        println("-----")
    }

    //while - based condition
    var counter = 0
    while (counter < 5){
        println("While loop running $counter")
        counter++
    }

    println("Counter : $counter")
    // do-while
    do{
        println("Do block..$counter")
        counter--
    }while (counter != 0)

    // control statements - break, continue

    val str = "Hi! Hello! How are yOu?"

    for (ch in str){
        if (ch == '!')
        {
            println("Got '!' ..continue")
            //break
            continue
        }
        println("Char : $ch")
    }

    // count no vowels- a, e, i, o, u
    var vowelCount = 0
    var consonantCount = 0
    var extra = 0
    for (ch in str){
        when(ch.lowercase()){
            "a", "e","i","o","u" -> vowelCount++
            in "a".."z" -> consonantCount++
            else -> extra++
        }
    }
    println("Vowel count: $vowelCount")
    println("Consonant Count: $consonantCount")
    println("Extra: $extra")
    println("Total length: ${str.length}")

    println("DONE")

}