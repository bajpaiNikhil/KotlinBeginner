package com.capgemini.kotlinproject

data class Car(var speed: Int, var make: String)

enum class AccountType{
    SAVING, CURRENT, FD, rd
}

fun getInterestRate(type: AccountType) : Double{
    when(type){
        AccountType.SAVING -> return 3.2
        AccountType.CURRENT -> return 4.0
        AccountType.FD -> return 5.5
        AccountType.rd -> return 10.0
    }
}

fun main() {

    val myCar = Car(80, "Hundai Sonata")
    val anotherCar = Car(80, "Hundai Sonata")

    println(myCar)

    if(myCar == anotherCar){
        println("Same")
    }
    else
        println("different")

   val rate = getInterestRate(AccountType.CURRENT)
    println("Rate: $rate")
}