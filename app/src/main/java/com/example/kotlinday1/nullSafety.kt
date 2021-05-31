package com.capgemini.kotlinproject

fun main() {

    var str1 = "hello" // non-null reference

    var str2 : String? = null // nullable refernce
    //str2 = "john"
    //str2 = null

    //val length = str2.length
// null-safety - kotlin, swift, dart, GO
    // 1. explicit check for null

    if( str2 != null){
        println("Length: ${str2.length}") // smart-cast done by compiler
    }else{
        println("Null string")
    }

    // 2. safe-call operator  ?.

    var length = str2?.length
    println("Using safe-call operator:  $length")

    // 3. elvis operator ?: - if left side expression evalutes to null, returns right side operand
    //str2 = "shridevi"
    length = str2?.length ?: 0 // null-coalescing operator
    println("With elvis operator: $length")


    // 4. assertion operator !!
    str2 = "john"
    //val x : String = str2 ?: ""

    val x :String = str2!!  // forcefully unwrapping of nullable reference - chance of NPE
    println("X: $x")
    println("lenght: ${str2!!.length}")

}