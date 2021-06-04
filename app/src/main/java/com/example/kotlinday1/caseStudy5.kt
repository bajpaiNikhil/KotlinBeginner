package com.example.kotlinday1


/*
class Account (Base)
    - accountName - read-only
    - accountNum - read-only
    - balance - mutable (should not be part of constructor)

    - deposite(amount)
    - withdraw(amount)
    - displayInfo()
class SavingsAccount : Account (Derived)
    - interestRate - read-only

    - depositeInterest() - calculate interest and add it to balance.

 */

/*
    Class Student
        - name
        - rollNo
        - marksScored
        - TotalMarks = 1000 (common to all)
        - displayInfo()
        - calculatePerc()

    Class University
        - name
        - list of Students - List<Student>

        - addStudent()
        - getTopper() - Student with max percentage
        - displayAllStudents()
 */

/*
open class Account1{
    open var accNo: Int = 0
    open var accountName:String? = null
    open var amount:Float = 0f


    fun insert(accNo:Int , accountName:String , amount : Float){
        this.accNo = accNo
        this.accountName = accountName
        this.amount = amount
    }

    fun deposite(money : Float){
        amount+=money
        println("Available balance : ${amount}")
    }

    fun withDraw(money : Float){
        if(amount < money){
            println("no FUnd avaiable : ${money}")
        }else{
            amount -=money
            println(amount)
        }
    }

    fun display(){
        println("NAMe : $accountName")
        println("ACCNO : $accNo")
        println("MONEYYYY : $amount")
    }
}

class SavingsAccount(accNo: Int ,accountName: String , val intrestRate : Float) : Account1(){

}
*/

class Student {
    var studentName : String = ""
    var rollNo :Int = 0
    var marksScored :Int = 0
    val totalMarks : Int = 1000

    fun insert(studentName: String , rollNo : Int , marksScored : Int){
        this.studentName = studentName
        this.rollNo = rollNo
        this.marksScored = marksScored
    }
    fun calculatePercentage(){
        val percentage : Float = marksScored/1000f

        println("Student : ${studentName} With RollNO :${rollNo} Havind %age : ${percentage*100}")
    }
    fun displayInfo(){
        println("Student Name :${studentName}")
        println("ROLL NO : ${rollNo}")
        println("Marks Scored : ${marksScored}")
    }
}

class University(){

}

fun main() {
//
//    val account = Account1()
//    account.insert(12343 , "Sisjvbahidb" , 1234f)
//    account.deposite(100f)
//    account.withDraw(150f)
//    account.withDraw(50f)
//    account.display()
    val student1 = Student()
    student1.insert("opwkfigjnf",121,123)
    student1.calculatePercentage()
    student1.displayInfo()

}
