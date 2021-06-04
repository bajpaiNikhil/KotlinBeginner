package com.capgemini.kotlinproject

fun main() {

    val arr = arrayOf(1,2,3,4)

    // let - referencing 'it' and returns last expression

    val arrSize = arr.let {
        println("Array: ${it.contentToString()}")
        println("Size: ${it.size}")
        it.size
    }

    println("Array size: $arrSize")

    val e = arr.first().let {
        it + 10
    }

    println("Updated first element: $e")
    customPrint(arr)
    customPrint(null)

    // run - object referenced with 'this', returns last expression

    val lastElement = arr.run {
        println("Size: ${size}")
        this[lastIndex] = 0
        this[lastIndex]
    }
    println("Updated array: ${arr.contentToString()}")
    println("Last Element: $lastElement")

    // with - object referenced with 'this' and returns last expression
    with(arr){
        println("First Element: ${first()} ")
        println("Is empty? ${isEmpty()}")
        println("Last element: ${last()}")
    }

    val data = "Kotlin Programming"
    // use with() - print- count of vowels, is this empty
    val vCount = with(data){
        var count = 0
        for (ch in this){
            when(ch){
                'a', 'e', 'i','o', 'u' -> count++
            }
        }
        println("Vowel Count: $count")
        println("String empty: ${isEmpty()}")
        count
    }

    // apply - returns same object, object is referred with 'this
    //

    val numbers = IntArray(4).apply {
        this[0] = 10
        this[lastIndex] = 20
       // println("Content: ${contentToString()}")
    }
    //customPrint(numbers.toTypedArray())
    println("Contents: ${numbers.contentToString()}")

//    numbers[0] = 10
//    numbers[3] = 20


    // also - return same object, reference is 'it'

    val digits = IntArray(5).also {
        if( it.isNotEmpty())
            customPrint(it.toTypedArray())

    }

    println("Size of array: ${digits.size}")


}



fun customPrint(arr : Array<Int>? ){
    print("[")
//   arr?.let {
//       for (e in it){
//            print("$e,")
//       }
//   }

    arr?.run {
        for (e in this) print("$e, ")
    }
    print("]")
}