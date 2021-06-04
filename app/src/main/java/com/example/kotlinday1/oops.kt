package com.capgemini.kotlinproject

//class Employee{
//    // members/attributes
//
//    // properties - data members
//    var firstName : String = ""
//    var lastName : String = ""
//    val salary: Int = 1000 // read-only
//
//    // method
//    fun displayInfo(){
//        println("-------")
//        println("Name: $firstName $lastName")
//        println("Salary: $salary")
//    }
//
//}

class Employee(firstName: String, var lastName: String, var salary: Int = 1000){
    var firstName : String
    var bonus: Int = 100
    var city: String = "Bangalore"

    companion object{
        var empCount = 0
        fun displayCount(){
            println("Emp Count: $empCount")
        }

    }


    constructor(firstName: String,lastName: String,salary: Int,city: String )
            : this(firstName, lastName, salary, 200){
        this.city = city
    }

    //secondary constructor
    constructor(firstName: String, lastName: String, salary: Int, bonus: Int)
            : this(firstName, lastName, salary){
        this.bonus = bonus
    }


    init {
        println("Init executed")
        this.firstName = firstName.uppercase()
        empCount++
    }

    fun displayInfo(){
        println("-------")
        println("Name: $firstName $lastName")
        println("Salary: $salary")
        println("Bonus: $bonus")
        println("City: $city")
    }
}

// extension function
fun Employee.applyBonus(){
    this.salary += this.bonus
}


fun main() {
    val emp1 = Employee("John", "smith", 2000)
    emp1.applyBonus()

   // emp1.firstName = "John"
    emp1.lastName = "Rose"
  //  emp1.salary = 20000

    println("Salary of emp1: ${emp1.salary}")
    emp1.displayInfo()

    val emp2 = Employee("Merry", "Rose")
    emp2.displayInfo()

    val emp3 = Employee("Mike", "Tyson", 3000, 200)
    emp3.displayInfo()

    val emp4 = Employee("Robert", "Laidlaw", 4000, "Phoenix")
    emp4.displayInfo()

    //println("Total employees: ${Employee.empCount}")
    Employee.displayCount()



}