package com.capgemini.kotlinproject

fun main() {
    val data = arrayOf(1,2,3,4,5) // Array<Int>
    println(data)
    println("Array: ${data.contentToString()}")

    println("Size of array: ${data.size}")
    println("first element: ${data.first()}") //${data[0]}
    println("Last element: ${data.last()}")

  //  println("element at index 10: ${data[-1]}")

    data[0] = 10 // object modified not the reference
    println("Updated: ${data.contentToString()}")

    data.sort()
    println("Sorted: ${data.contentToString()}")

    data.reverse()
    println("Reversed: ${data.contentToString()}")


    println("is 10 available? : ${data.contains(10)}")
    println("10 available at index: ${data.indexOf(10)}")

    val another : Array<String> = Array(4){""}

    println("Created: ${another.contentToString()}")
    another[0] = "john"
    another[another.lastIndex] = "merry"
    println("Updated: ${another.contentToString()}")

    val arr = IntArray(5) // premitive type - int[]
    println("arr : ${arr.contentToString()}")

    val arr1 = Array(5) {0} // Array<Int> ==> Integer[]
    println("arr1: ${arr1.contentToString()}")

    /*
        int a = 10 // premitive - stored memory
        Integer x = new Integer() // object - wraps int

     */

    val x = arr1.toIntArray()
    println("int[] : ${x.contentToString()}")
    x.toTypedArray()


}