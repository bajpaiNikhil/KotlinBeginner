package com.example.kotlinday1


fun main() {
    val data = arrayOf(1,2,3,4)
    println("${data.contentToString()}")

    var string = "hehehaha"
    var vowel = 0
    var consonant = 0
    for(ch in string){
        when(ch.lowercase()){
            "a","e","i","o","u" -> vowel++
            else -> consonant++
        }
    }
    println(vowel)
    println(consonant)


    /*
    for(i in 0..string.length-1){
        if( string[i] == 'a' || string[i]== 'e' || string[i]== 'i' || string[i]== 'o' || string[i]== 'u'){
            vowel++
            println("VOWEL : ${string[i]}")
        }
    }
    */

    print(vowel)
}