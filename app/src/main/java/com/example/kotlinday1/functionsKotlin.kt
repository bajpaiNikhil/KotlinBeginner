package com.example.kotlinday1

fun main() {
    println(getName())
    println(square(5))
    println(square1(5))

    var result = sum(10,2)
    println(result)
    displayInfo(city = "ifujngfd",age = 94385 , name = "fjvdbnfkmdfv")
    calculateEMI(1000,20.8)
    calculateEMI(204359685)
    println(joinName("a","b","igbnfakfvdjbnj"))


}

fun getName():String {
    return "HEHEHAHA"
}

fun square(number: Int):Int{
    return  number * number
}
fun square1(number : Int) = number * number

//required argument.
fun sum(a:Int,b: Int ) =  a+b

//named argument
fun displayInfo(name :String , age:Int , city:String){
    println(name)
    println(age)
    println(city)
}

//default argument - good alternative for funcution overloading,

fun calculateEMI(amount:Int , rate:Double = 10.0){
    val emi = amount * rate/100
    println(amount)
    println(rate)
    println(emi)
}
// variable length argument

fun joinName(vararg names: String):String{
    //concatenate all the string
    println(names.size)
    var j = ""
    for(name in names){
        j+=name + " : "
    }
    return j
}


/* type of arguments
*  1. Positional Argument
*  2. Default "
*  3. Named arguments
* */