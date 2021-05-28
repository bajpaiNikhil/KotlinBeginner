package com.example.kotlinday1

fun main() {
    println("prime number b/w 1...20")
    for(i in 2..20){
        var Flag = 1
        var k = 2

        while (k < i){
            if(i % k == 0){
                Flag = 0
                break
            }
            k++
        }
        if (Flag == 1){
            println(i)
        }
    }

    println("SIZE OF NUMBER")
    var number = 12345765432345
    var stringNumber = number.toString()
    println(stringNumber.length)



    println("FACTORIAL OF A NUMBER")
    var num = 20
    var result = 1
    var factorail = result.toBigInteger()
    for(i in 2..num){
        factorail *= i.toBigInteger()
    }
    println(factorail)


    println("REVERSE A NUMBER")
    var numberRev = 123457654323450
    var numberRevStrig = numberRev.toString()
    print(numberRevStrig.reversed())

}