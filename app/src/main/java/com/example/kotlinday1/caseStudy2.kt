package com.example.kotlinday1

fun main() {

    val logData = """
    this is error log #2 with message
    this is debug log #5
    this is error log #24
    this is debug log #100 
    this is error log #67 with no message
    """.trimIndent()
// Total No of logs
// No of debug logs
// No of error logs
// For error logs- log number (#)

    val li = logData.lines()

    // Total No of log
    /*
    var l = 0
    for (i in li){
        if (i.contains("log")){
            l++
        }
    }
    */
    var l = 0
    println("Total No. of log: $l")
    var d =0
    var e = 0
    for (i in li){
        when{

            // Total No of debug
            i.contains("debug") -> d++
            // Total No of error
            i.contains("error") -> e++
            i.contains("log") -> l++
        }
    }
    println(l)
    println("Total No. of debug: $d")
    println("Total No. of error: $e")



}