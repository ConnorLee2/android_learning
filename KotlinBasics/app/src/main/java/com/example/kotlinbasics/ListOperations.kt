package com.example.kotlinbasics

fun main() {
    var fruitsList = mutableListOf("Apple", "Banana", "Cherry", "Grape", "Orange")
    println(fruitsList)
    fruitsList.add("Raspberry")
    println(fruitsList)
    fruitsList.remove("Raspberry")
    println(fruitsList)
    val isApple = fruitsList.contains("Apple")
    if (isApple) {
        println("Contains apple")
    } else {
        println("Does not contain apple")
    }
}