package com.capgemini.kotlinproject


fun main() {

    //1. print all prime numbers between 1 to 20
    // number having exactly two divisor - 1 and number itself

    var isPrime = true

    for (num in 2..20){
        isPrime = true
        for (divisor in 2.rangeTo(num-1)){
            if (num % divisor == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime)
            println("$num is prime")
    }


    //2.  Count no. of digits in number(int)
    var count = 0
    var num = 123456789

    while (num != 0) {
        num /= 10
        ++count
    }

    println("No. of digits: $count")

    //3.  find factorial of number
    // n! = n * (n-1)!
    // 1! = 1

    num = 512
    val oneFactorial = 1

    var factorial = oneFactorial.toBigInteger()
    for (i in 1..num) {
       // factorial = factorial * i.toBigInteger();
        factorial *= i.toBigInteger()
    }
    println("Factorial of $num = $factorial")

    //4. reverse a number
    num = 123456789
    var reversed = 0

    while (num != 0) {
        val digit = num % 10
        reversed = reversed * 10 + digit
        num /= 10
    }

    println("Reversed : $reversed")


}