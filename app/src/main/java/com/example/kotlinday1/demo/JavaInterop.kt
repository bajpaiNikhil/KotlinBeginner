package com.capgemini.kotlinproject.demo

import java.util.*

var counter = 10

fun log(){
    println("Kotlin function executed..")
}

data class Animal(val eyeColor: String, var noOfLegs: Int)

fun main() {

    val cust = Customer()
    val result = cust.doOperation()
    println("Result: $result")


   // cust.firstName = "Shridevi" // cust.setFirstName("Shridevi")
    cust.lastName = "Sawant" // cust.setLastName("Sawant")

    println("FirstName: ${cust.firstName}") // cust.getFirstName()
    println("LastName: ${cust.lastName}")

    val t = Calendar.getInstance().time.toString()
    println("Current time: $t")

    // is, as, in, object - kotlin keyword

    var data: Any
    data = "hello"
    data = 10
    // 'is' - type check
    if (data is String){
        println("its string")
    } else if(data is Int){
        println("its integer")
    }

//    val res = cust.`is`()
//    println("Is firstname empty: $res")

    // as - type casting

    val listOfNum = listOf(1,2,3)
    val newList = listOfNum as MutableList<Int>
    println("Converted: $newList")

    val i = 10
    val doubleI = i.toDouble()

    cust.`as`()

    val john = Customer()
  //  john.firstName = "John"
    println("FirstName: ${john.firstNameUppered()}")

    val fName = john.firstNameUppered()
    if( fName != null)
        println("lenght : ${fName.length}")
    else
        println("Got NULL from Java method")

}