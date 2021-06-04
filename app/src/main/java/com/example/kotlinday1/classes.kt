package com.capgemini.kotlinproject

data class Point(var x: Int, var y: Int){

    // overload '+'
    operator fun plus(b: Point) : Point {
        val resultX = this.x + b.x
        val resultY = this.y + b.y
        return Point(resultX, resultY)
    }

    infix fun growBy(size: Int): Point{
        return Point(x+size, y+size)
    }


}


class A{
    val a = 10

    inner class B{
        val b = 20
        val result = a + b
    }

    fun demo(){
        val bObj = B()
        println("Sum= ${bObj.result}")
    }
}

fun main() {
    val p1 = Point(0, 10)
    val bigP1 = p1 growBy 20
    println("Size increased: $bigP1")

    val obj = A()
    obj.demo()

    val p2 = Point(10, 20)

    val p3 = p1 + p2 // p1.plus(p2)
    println(p3)

}