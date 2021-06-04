package com.capgemini.kotlinproject

fun main() {
    val listOfNum = listOf(1,2,3,4,5,6,7, 8, 9, 10)

    println("Original: $listOfNum")
    // list of even numbers

    var evenList = mutableListOf<Int>()
    for (num in listOfNum){
        if(num % 2 == 0)
            evenList.add(num)
    }
    println("Even List: $evenList")

    // filter
    val evenListWithFilter = listOfNum.filter { it % 2 == 0 }
    println("With filter: $evenListWithFilter")

    val contacts = mapOf("John" to 333, "Merry" to 222, "Mike" to 333)

    // all numbers of people, name starting wiht 'M'

    val filteredMap = contacts.filter { (name, num) ->
        name.startsWith('M')
    }

    println("Filtered: ${filteredMap.values}")

    // whose number is '333'
    val names = contacts.filter {
        it.value == 333
    }

    println("names : ${names.keys}")

    val numbers = listOf(1,2,3,4,5,6,7,8)

    // square each number
    val squareList = mutableListOf<Int>()
    numbers.forEach {
        squareList.add(it * it)
    }

    println("SQuare List: $squareList")
    // map -

    val squareListWithMap = numbers.map { it * it  }
    println("SQuaredList with map: $squareListWithMap")

    // square of even numbers
   val squareOfEvens = numbers.filter { it % 2 == 0 }.map { it * it}
    println("SQuare of evens: $squareOfEvens")

    // cumulative product
    var product = 1
    numbers.forEach {
        product *= it
    }
    println("Cumulative product: $product")

    // reduce() -
    val productWithReduce = numbers.reduce { prod, i ->
        prod * i
    }

    println("Cumulative product with reduce: $productWithReduce")

    val strList = listOf("John", "Saaa" ,"abcdefgchkas", "Merry", "Robert", "Sunny")

    val result = strList.reduce { str1, str2 ->
        str1 + "-" +str2
    }

    println("Result: $result")

    // name with longest length
    val maxLenghtName = strList.reduce { str1, str2 ->
        if (str1.length > str2.length) str1 else str2
    }
    println("name: $maxLenghtName")

    val grouped = strList.groupBy {
        it.length
    }

    println("Grouped: $grouped")

    val listOfNames = listOf("John", "Mery", "Robert")
    val listOfNumbers = listOf(111, 222)

    val zipped = listOfNames.zip(listOfNumbers)
    println("Zipped: $zipped")
}