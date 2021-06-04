package com.example.kotlinday1

class Employee(var firstName:String , var lastName: String ,val salary :Int ){

    init{
        println("INIt BLOCKCK")
        firstName = firstName.uppercase()
    }
    //Members or attributes

    //Properties
//    var firstName :String = " "
//    var lastName : String = " "
//    val salary :  Int = 1000 // REad only property .

    //Method
    fun displayInfo(){
        println("Name : ${firstName} ${lastName}")
        println("Salary : $salary")

    }
}

fun main() {

    val person = Employee("ajeigbr", "OEFIWN" , 132435)
    person.firstName = "efksgnjbfhdmk"
    person.lastName = "ifsvdgdnkfiojn"
    person.displayInfo()
    println(person.firstName)
    println(person.lastName)
    println(person.salary)


}