package com.example.kotlinday1

fun main() {
    val listOfName = listOf<String>("DCKNVS","sjvfbi","ifvban") //immutable i.e cant change
    println(listOfName)

    val mutableListOfNames = mutableListOf<String>( "VNSD","VHBIN","fdbono") //mutable
    println(mutableListOfNames)
    mutableListOfNames.add(3,"pfojngdbh")
    println(mutableListOfNames)

    val mutableArrayListOfNames = arrayListOf<String>("fdbvinm","iojfudng","owiengbr") // mutable[[
    println(mutableArrayListOfNames)
    mutableArrayListOfNames.add(1,"dskmfdgjnf")
    println(mutableArrayListOfNames)

    val mapOfName = mapOf<String,String>("name" to "ifnjgh" ,"age" to "20" ,"nationality" to "oiewfnjdgfj" , Pair("s" ,"23"))//mapOf is also immutable for mutable use hashmap.
    println(mapOfName.get("age"))
    println(" 1 " + mapOfName.entries)

    val hashMapOfName = hashMapOf<String,String>("name" to "ifnjgh" ,"age" to "20" ,"nationality" to "oiewfnjdgfj")//mapOf is also immutable for mutable use hashmap.
    hashMapOfName.put("sdvfjdnhm" ,"idvsfjn19")

    println(hashMapOfName)

    // map - key-value pair
    // key is index



}