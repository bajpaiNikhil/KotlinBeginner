package com.capgemini.kotlinproject

open class Emp(var name: String, var salary: Int){
    open val bonus = 100

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
        println("------")
        println("NAme: $name")
        println("Salary: $salary")
    }

    override fun toString(): String {
        return "Name: $name, Salary: $salary"
    }

}
// End of EMP

class Developer(name: String, salary: Int, var skills: String) : Emp(name, salary){

    //overridden property
    override val bonus = 200

    companion object {
        var devCount = 0
    }
    init {
        println(" init of Developer")
        devCount++
    }
    //method overriding
    override fun displayInfo(){
        super.displayInfo()
        println("Skills: $skills")
    }


}

/*
class Tester - inherited from Emp
- TestingTool
- displayInfo() - override
    bonus = 150

    TesterCount - total tester count


 */

class Tester(name: String, salary: Int, tool: String) : Emp(name, salary) {
    val testingTool : String = tool
    override val bonus = 150
    companion object{
        var testerCount = 0
    }
    init {
        testerCount++
    }

    override fun displayInfo() {
        super.displayInfo()
        println("TEsting Tool: $testingTool")
    }

}



fun main() {

    val emp1 = Developer("John", 1000, "Kotlin")
    val emp2 = Emp("Merry", 1000)
    val emp3 = Tester("Mike", 1000,"Selenium")


    println(emp1)
//    val listOfEmp = listOf(emp1, emp2, emp3)
//
//    // runtime polymorphism - method overriding
//    for (emp in listOfEmp){
//        emp.applyBonus()
//        emp.displayInfo()
//    }


    println("Total Employees: ${Emp.empCount}")
    println("Total Developers: ${Developer.devCount}")
    println("Total Testers: ${Tester.testerCount}")
}