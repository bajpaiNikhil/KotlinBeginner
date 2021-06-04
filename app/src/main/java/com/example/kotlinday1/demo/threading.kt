package com.capgemini.kotlinproject.demo

import kotlin.concurrent.thread

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
    println("main Executed by ${Thread.currentThread().name}")
    val t1 = thread(name = "addThread") {
     //   Thread.sleep(4000)
//        val isErr = true
//        if(isErr) return@thread
        add(10 , 20)
    }

    val t2 = thread (name = "subtractThread") {
        Thread.sleep(4000)
        subtract(10, 5)
    }
   // println("t2 thread started..")
   // t1.start()
    println("Threads are running...")


//    t1.join() // blocking
//    println("t1 is done")
//    t2.join()
//    println("t2 is done")
////    //code to be executed after t1 and t2 done
    println("-- DONE --")
//
//    for(i in 1..100_000){
//        thread {
//            Thread.sleep(4000)
//            print("*")
//        }
//    }
}