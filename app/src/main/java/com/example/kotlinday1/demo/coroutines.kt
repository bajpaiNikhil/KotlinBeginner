package com.capgemini.kotlinproject.demo

import kotlinx.coroutines.*


private fun add(a: Int, b: Int) {
    println("add() Executed by ${Thread.currentThread().name}")
    val result = a + b
    println("ADD result: $result")
}

private fun subtract(a: Int, b: Int) {
    println("subtract() Executed by ${Thread.currentThread().name}")
    val result = a - b
    println("Subtract result: $result")
}


fun main() {


    // coroutine builder - launch, async, runblocking...

    //runBlocking - create parent coroutine, waits for child coroutines to finish
    println("main Executed by .. ${Thread.currentThread().name}")
    runBlocking {

//        add(10, 20)
//        subtract(30,1)

        // child coroutine
        val j1 = launch {
            delay(2000) // non-blocking
           // Thread.sleep(2000) // blocking
            add(10,20)
        }

        val j2 = launch (Dispatchers.Default) {
            delay(1000)
           // Thread.sleep(1000)
            subtract(30, 5)
        }

        val randomNo = async {
            getRandom()

        }


        println("Jobs are executing.....")

        println("Random No : ${randomNo.await()}")

       // j1.cancel("")

        //code to execute after both jobs are done
        j1.join()
        println("J1 done")
        j2.join()
        println("j2 done")
        println("-- DONE ---")

        for (i in 1..10_1000){
            launch {
                print("*")
            }
        }

    }

}

suspend fun getRandom() : Int {
    delay(3000)
    return (Math.random() * 100).toInt()
}