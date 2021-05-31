package com.capgemini.kotlinproject

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

    val lines = logData.lines()
    var errCount = 0
    var debugCount = 0

    println("Total: ${lines.size}")
    for (line in lines){
        when{
            line.contains("error") ->
            {
                errCount++
                val hashPos=line.indexOf('#')
                val spacePos = line.indexOf(' ',hashPos)
                var errNo = ""
                if (spacePos != -1)
                    errNo = line.substring(hashPos+1, spacePos)
                else
                    errNo = line.substring(hashPos+1)

                println("Error log number: $errNo")
            }
            line.contains("debug") -> debugCount++
        }

    }

    println("Error Count: $errCount")
    println("Debug Count: $debugCount")

}