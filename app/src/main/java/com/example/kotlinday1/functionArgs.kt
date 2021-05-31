package com.capgemini.kotlinproject

fun main() {
    var result = sum(10, 20)
    println("SUM : $result")

    displayInfo("John", 20, "New York")
    displayInfo(age = 30, name = "Merry", city = "Bangalore")
    displayInfo("Robert", city = "Pune", age = 33 )

    calculateEMI(1000, 20.0)
    calculateEMI(1000)
    calculateEMI(1000, 20.0, 24)
    calculateEMI(1000, duration = 24)

    joinNames("-","john", "merry", "robert")
    joinNames(delimiter = "*",  "x", "y", "z")
}

// 1. required arguments
fun sum(arg1: Int, arg2: Int) = arg1 + arg2

//2. named arguments
fun displayInfo(name: String, age: Int, city: String){
    println("NAme: $name")
    println("Age: $age")
    println("City: $city")
}

//3. default arguments - good alternative for function overloading
// multiple default args supported
fun calculateEMI(amount: Int, rate: Double = 10.0, duration: Int = 12){
    val emi = amount * rate/100/ duration

    println("Amount: $amount")
    println("Rate: $rate")
    println("Duration : $duration")
    println("EMI: $emi")
}



//4. variable lenght arguments - only one
// cannot be supplied as a named argumnets

fun joinNames(delimiter: String, vararg names: String){
    // concatenate all strings
    println("No. of names: ${names.size}")
    var joined  = ""
    for (n in names){
        joined += n + delimiter
    }
    println("Joined: $joined")
}

