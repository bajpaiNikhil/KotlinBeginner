package com.capgemini.kotlinproject

// function type -
// (Int, Int) -> Int
fun doAdd(a: Int, b: Int) : Int{
    return a + b
}

// (Int, Int) -> Int
fun doSubtract(a: Int, b: Int)  = a - b

// (String) -> Unit
fun displayInfo(name: String){
    println("Name: $name")
}
fun main() {

    var f : (Int, Int) -> Int

    f = ::doAdd // :: -- function referencing operator
    var result = f(10, 20)
    println("ADD result: $result")

    f = ::doSubtract
    result = f(30, 10)
    println("Subtraction : $result")

    doOperation(10, 20, ::doAdd)
    doOperation(100, 50, ::doSubtract)

    // lambda expression - annonymous function- unnamed functions
    // { arg1: type, arg2: type -> body
// }
    // faster execution
    // scope - visible where they have defined
    // short -lived function
    val doMultiply = { a : Int, b: Int ->
        val result = a * b
        println("$a * $b = $result")
        result
    }

    doMultiply(10, 20)

    doOperation(100, 20, doMultiply)
    doOperation(100, 10, { a, b -> a/b } )
    doOperation(20, 5) {a, b -> a/b} // trailing lambda

    // lambda
    var x = { str: String ->
        println("Input $str")
        str.toInt()
    }

    x = {
        println("-------")
        it.toInt()
    }

    val res = x("10") + 100
    println("Res: $res")

    val square : (Int) -> Int = { it * it}
    println("SQuare of 10: ${square(10)}")

    convertStr("Hello", {a -> a.uppercase()})
    convertStr("Hello", { it.lowercase()})
    convertStr("Hello") {it.replace('H', '*')}

    var num = -4
    while (num != 0) {
        println("Num : $num")
        val op = makeZero(num)
        num = op(num)
        //num = makeZero(num)(num)
    }
}

fun incrementByOne(num : Int) = num+1

fun decrementByOne(num: Int) = num - 1

// higher order function
fun makeZero(num : Int) : (Int)-> Int {
    if(num > 0)
        return ::decrementByOne
    else
        return ::incrementByOne
}

// higher order function
fun doOperation(arg1 : Int, arg2: Int, operation: (Int, Int) -> Int){

    val result = operation(arg1, arg2)
    println("RESULT in doOperation: $result")
}

fun convertStr(str: String, conversion: (String) -> String){
    println("Converted string: ${conversion(str)}")
}

