package com.capgemini.kotlinproject

// function definition
fun add(a : Int, b: Int) : Int {
    val result = a + b
    println("Addition: $result")
    return result

}

// function overloading
fun add(a: String, b: String): String{
    var result = "$a $b"
    print("Joined : $result")
    return result
}

//fun add(a: Double, b: Double) : Double {
//    return a + b
//}

//one-liner functions
fun add(a: Double, b: Double) = a + b


fun displayInfo(name: String?, id: Int)  {
    println("NAme: ${name?.uppercase() ?: ""}")
    println("ID: $id")
}


fun main() {
    val res = add(10, 20) // calling
    println("Result: $res")

    val joined = add("Hi", "Kotlin")
    val result = add(12.12, 10.0)
    println("Result: $result")

    displayInfo("John", 1)
    displayInfo(null, 2)

}