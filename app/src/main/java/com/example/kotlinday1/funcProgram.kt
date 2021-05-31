package com.capgemini.kotlinproject

fun main() {

    val arr : Array<Any> = arrayOf(1,2,3,4)
//    println("Array elements: ${arr.contentToString()} ")

    arr.printArray()

    val strArray : Array<Any> = arrayOf("john", "merry", "robert")
    strArray.printArray()

    val str1 = "Kotlin Programming"
    val removed = str1.removeSpaces()
    println("Spaces removed: $removed")

    val num = 10
    println("$num is even? ${num.isEven()}")

    printCircleArea(10)
}

// nested functions
fun printCircleArea(radius: Int){
    val pi = 22 / 7.0
    // local function
    fun calculate(): Double {
        val area = pi * radius
        return area
    }

    val area = calculate()
    println("Area of circle with radius $radius : $area")
  //  fun calculate() = pi * radius

}

// extension function
fun Array<Any>.printArray(){
    print("[")
    for (e in this){
        print("$e, ")
    }
    print("]")
}

// extension function - add function in String to remove spaces

fun String.removeSpaces() : String {
    return this.replace(" ", "")
}

// add function to Int which returns boolean - is it even number?

fun Int.isEven(): Boolean {
    return this % 2 == 0
}