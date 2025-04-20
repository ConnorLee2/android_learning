package com.example.kotlinbasics

fun main() {
    var myAge : Byte = 35
    println(myAge)
    myAge = 36

    println("Hello Connor!")
    println(myAge)

    var pi = 3.14
    println(pi)
    pi = 3.1415926535
    println(pi)

    var age: UShort = 35u
    println(age)

    val myTrue: Boolean = true
    val myFalse: Boolean = false
    val boolNull: Boolean? = null

    println(myTrue || myFalse) // true
    println(myTrue && myFalse) // false
    println(!myTrue) // false
    println(boolNull) // null

    val myChar = 'a'
    println(myChar)
    val unicode = '\u00AE'
    println(unicode)

    var name = "Connor"
    name = "Frank"
    name = "Very LONG paragraphs can be stored inside of strings"
    println(name)
    println(name.lowercase())
    println(name.uppercase())
    println(name + " hello")

    var myCurrentAge = 50
    var enteredValue = readln()
    myCurrentAge = enteredValue.toInt()

    if (myCurrentAge >= 40) {
        // then execute what's in here
        println("you can not go into the club, please go home")
    } else if (myCurrentAge >= 18) {
        println("you can go into the club")
    } else {
        // then execute this in here
        println("You are too young to go into the club!")
    }

    var count = 0

    while (count < 3) {
        println("Count is $count")
        count++
    }
    println("Loop is done")

    var userInput = readln()
    while (userInput == "1") {
        println("While loop executed")
        userInput = readln()
    }
    println("Loop is done")
}