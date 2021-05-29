package com.example.kotlinday1

import java.time.temporal.TemporalAmount


fun main() {
    val user : ExampleClass = ExampleClass()
    user.bio

    val account = Account()
    account.insert(12343 , "Sisjvbahidb" , 1234f)
    account.deposit(100f)
    account.withDraw(150f)
    account.withDraw(50f)
    println(account.amount)
    println("Amount no ${account.accNo} , Name is ${account.name} , Amount is : ${account.amount}")
}

class  ExampleClass {
    val name : String = ""
    val phNumber : Int = 1
    val email : String = ""
    val bio : String = ""

    fun checkMail(): Boolean {
        return email.isNotEmpty()
    }
}

class  Account {
    var accNo: Int = 0
    var name:String? = null
    var amount:Float = 0f

    //this pint to the current receiver // current class object

    fun insert(ac:Int , name:String , amount : Float){
        this.accNo = accNo
        this.name = name
        this.amount = amount
    }

    fun deposit(money:Float){
        amount += money
        println(amount)
    }
    fun withDraw(money : Float){
        if(amount < money){
            println("no FUnd avaiable : ${money}")
        }else{
            amount -=money
            println(amount)
        }
    }
}