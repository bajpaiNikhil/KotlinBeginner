package com.example.kotlinday1

/*

class Tester - inherited from Emp
- TestingTool
- displayInfo() - override
    bonus = 150

    TesterCount

 */
open class Emp(var name: String, var salary: Int){

    // overridden property
    open val bonus = 500

    companion object{
        var empCount = 0
    }

    init {
        println("Init of Emp")
        empCount++
    }

    fun applyBonus(){
        salary += bonus
    }

    open fun displayInfo(){
        println("------------")
        println("Name: $name")
        println("Salary: $salary")
    }
}

class Developer(name: String, salary: Int, var skills: String) : Emp(name,salary){
    override val bonus = 300

    companion object{
        var devCount = 0
    }

    init {
        println("Init of Developer")
        devCount++
    }
    //method overriding
    override fun displayInfo(){
        println("----- Developer -----")
        super.displayInfo()
        println("Skills: $skills")
    }
}

class Tester(name: String,salary: Int, var testingTool: String) : Emp(name,salary){
    override var bonus = 150

    companion object{
        var testCount = 0
    }

    init {
        println("Tester init")
        testCount++
    }

    override fun displayInfo() {
        super.displayInfo()
        println("Tester Tool: $testingTool")
    }
}

fun main() {
    val emp1 = Developer("Harry",5000,"Kotlin")
    emp1.applyBonus()
    emp1.displayInfo()

    val emp2 = Emp("Ron",4000)
    emp2.applyBonus()
    emp2.displayInfo()

    val emp3 = Tester("Shivam",6000,"Selenium")
    emp3.applyBonus()
    emp3.displayInfo()

    println("Total Employees: ${Emp.empCount}")
    println("Total Developer: ${Developer.devCount}")
    println("Total Tester: ${Tester.testCount}")
}