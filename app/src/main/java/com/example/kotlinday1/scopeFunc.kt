package com.example.kotlinday1


fun main() {
    val arr = arrayOf(1,2,3,4,5,6,7)

    //let - referencin "it" and return the expression
    val sizeArr = arr.let{
        //println(it.contentToString())
        //println(it.size)
        it.size
    }
    //println(sizeArr)
    val e = arr.first().let{
        it+10
    }
    //println(arr.contentToString())
    customPrint(arr)

    //run - object referenced with a keyWord this and also it return last expression

    arr.run {
        println(this.size)
        this[lastIndex] = 0
    }
    //println(arr.contentToString())

    // with
    with(arr){
        print(arr.first())
    }

    val data  = "HEHEHAHA"

    with(data){
        var count = 0
        for( i in 0..data.length - 1){
            val ch = data[i]
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count+=1
            }
        }
        println(count)

        println(data.isEmpty())

    }
    //apply -  return the obejct itself on which we call them.Object is refered inside with this.

    val number = IntArray(4).apply {
        this[0] = 10
        this[lastIndex] = 1000
    }
    customPrint(number.toTypedArray())


    //also - return the same object referece with it

    val intergers = IntArray(5).also {
        if(it.isNotEmpty())
            customPrint(it.toTypedArray())

    }
//    if (intergers.isNotEmpty())
//        customPrint(intergers.toTypedArray())
//    else
//        println("EMpty")
}

fun customPrint(arr: Array<Int>?){
//    arr?.let{
//        for(e in it){
//            print(":${e}")
//        }
//    }
    arr?.run {
        print("{")
        for(e in this){
            print("${e} ")
        }
        print("}")
    }
}