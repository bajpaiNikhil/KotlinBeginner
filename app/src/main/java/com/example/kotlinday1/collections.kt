package com.capgemini.kotlinproject

import android.os.Build
import androidx.annotation.RequiresApi


val data = mutableMapOf<String, Int>() // global


@RequiresApi(Build.VERSION_CODES.N)
fun main() {

    // list - dynamic arrays
   // val langs = listOf("C", "C++", "Java", "Python", "Java")
    val langs = mutableListOf("C", "C++", "Java", "Python", "Java")

    println("Languages: $langs")
    println("Size: ${langs.size}")
    println("First element: ${langs[0]}")
    println("Last element: ${langs.last()}")

    for (e in langs) println("Element: $e")

    langs.forEach {
        println("Element: ${it.uppercase()}")
    }

    println("First 3 elements: ${langs.subList(0, 3)}")
    println("First 3 elements: ${langs.slice(0..2)}")
    if(langs.contains("Java")) { //if("Java" in langs) {
        println("Index of 'Java': ${langs.indexOf("Java")}")
        println("Last Index of 'Java': ${langs.lastIndexOf("Java")}")
    }
    else {
        println("'Java' not available")
    }

//    val shuffledList = langs.shuffled()
//    println("Shuffled: $shuffledList")

    // add, remove, update
    langs[0] = "Java" // update
    println("Updated: $langs")
    langs.add("Kotlin") // append
    println("Appended: $langs")
    langs.add(0, "Swift") // insert
    println("Inserted: $langs")

    // removal
    langs.remove("Java")
    println("Removed: $langs")



//    for (i in 0 until langs.size){
//        if(langs[i] == "Java"){
//            langs.removeAt(i)
//        }
//    }
    while ("Java" in langs)
        langs.remove("Java")

    println("Removed: $langs")

    langs.reverse()
    println("Reversed: $langs")

    // set - elements are unique, indexing not supported

    val listOfNum = listOf(1,2,1,2,3,4,5)
   // val setOfNum = listOfNum.toSet()
    val setOfNum = mutableSetOf(1,2,3,4,1,2)

    setOfNum.add(10)
    println("List: $listOfNum")
    println("Set: $setOfNum")
    //println("First element: ${setOfNum[0]}")

//    for (num in setOfNum){
//        println("Square of $num : ${num * num}")
//    }
    setOfNum.forEach {
        println("Square of $it : ${it * it}")
    }


    // map - key-value pairs
    // key is index

    val contacts = mutableMapOf("John" to 111, "Merry" to 333, Pair("Robert", 333))

    println("Contacts: $contacts")
    println("Size: ${contacts.size}")
    println("Names: ${contacts.keys}")
    println("Numbers: ${contacts.values}")

    contacts["Merry"] = 222 // update
    println("Updated: $contacts")

    contacts["Mike"] = 444 // add
    println("Updated: $contacts")

    // iterating over

    for(name in contacts.keys){
        println("Number of $name : ${contacts[name]}")
    }
    // all numbers
    for (number in contacts.values){
        println("Number: $number")
    }


    for ((pName, pNumber) in contacts.entries){
        println("Number of $pName : $pNumber")
        if(pNumber == 444){
            println("444 is number of $pName")
        }
    }

    // removal
    contacts.remove("John")
    println("Removed: $contacts")

    println("Number of 'Mike': ${contacts["Mike"]}")
    println("Number of 'Jeff': ${contacts["Jeff"]}")
    println("Number of 'Jeff': ${contacts.getOrDefault("Jeff", 800)}")
    if("Jeff" in contacts){
        println("Number of 'Jeff': ${contacts["Jeff"]}")
    }
    else{
        println("'JEff' not present")
    }
//    contacts.clear()
//    println("Cleared: $contacts")

    val officeContacts = mapOf("Jeff" to 123, "Merry" to 300, "Shridevi" to 400)

    // merging of maps
    contacts.putAll(officeContacts)
    println("Merged: $contacts")

    contacts.forEach { name, num ->
        println(" ${name.uppercase()} : $num")
    }
}