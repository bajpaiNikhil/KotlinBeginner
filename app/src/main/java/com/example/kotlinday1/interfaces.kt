package com.capgemini.kotlinproject

interface DisplayInterface {

    fun display() // abstract method

}

class MyClass : DisplayInterface{
    override fun display() {
       print("Kotlin Programming")
    }

}

interface WithdrawInterface {
    fun withDraw(amount: Int) // no implementation
    fun demo(){ // default implementation
        println("This is demo")
    }
}

interface DepositeInterface {
    fun deposit(amount: Int)
}

abstract class Account(val accName: String, val accNum: String){
    fun printDetails(){
        println("Name: $accName")
        println("Acc NO: $accNum")
    }
}

class SavingAccount(name: String, number: String): Account(name, number),
    WithdrawInterface, DepositeInterface{

    var balance = 0
    override fun withDraw(amount: Int) {
        balance -= amount
    }

    override fun deposit(amount: Int) {
        balance += amount
    }

    override fun demo() {
        super.demo()
    }

}

class FDAccount(name: String, number: String): Account(name, number), DepositeInterface {
    var fdAmount = 0
    override fun deposit(amount: Int) {
        fdAmount += amount
    }

}

fun main() {


}