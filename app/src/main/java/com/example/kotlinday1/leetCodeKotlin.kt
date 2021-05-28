package com.example.kotlinday1

fun main() {
    var array = arrayOf(1,4,2,5,3)
    var arraySize = array.size
    var summ=0

    println(array.contentToString())
    println(arraySize)

    for(i in array){
        println(i)
    }


}