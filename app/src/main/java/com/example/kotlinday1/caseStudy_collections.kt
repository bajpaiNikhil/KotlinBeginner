package com.capgemini.kotlinproject

/*
    Adhar database

    AdharNo, Name, MobileNo, City

    db : <Int, List<String> >
        Key - AdharNo
        Value - Name, MobileNo, City - Map

     1 = {"name" ="john", "mobile" = "111", "city"="Bangalore"}

    db[1]["mobile"] - mobile No
    db[123]["city"]

    // function -
    //addRecord(AdharNo, Name, MobileNo, City)

    // getMobile(AdharNo)

    // printDetails(adharNo)

    // printDetailsForCity(cityName)

 */

fun main() {


    val data = listOf("John", "Andy", "Anand", "Merry", "Henry")

// list of names starting with 'A'

    val accounts = listOf("111", "222", "123456789012")

// 1. account numbers with 12 digits
// 2. if account number != 12 digit, "NA"
// ["NA", "NA", "123456789012"]

    val num = listOf(100, 200, 2123123, 234234, 345, 123, 456)


// max number using reduce
}