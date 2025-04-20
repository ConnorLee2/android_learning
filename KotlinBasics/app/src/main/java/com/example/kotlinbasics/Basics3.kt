package com.example.kotlinbasics

fun main() {
    // Immutable list
    // val shoppingList = listOf("Processor", "RAM", "GPU", "SSD")
    // Mutable list
    val shoppingList = mutableListOf("Processor", "RAM", "GPU RTX 3060", "SSD")

    shoppingList.add("Cooling System")

    shoppingList.remove("GPU RTX 3060")
    shoppingList.add("GPU RTX 4090")

    println(shoppingList)
    println(shoppingList[4])
    shoppingList.set(3, "Water Cooling")
    println(shoppingList)

    for (item in 0 until shoppingList.size) {
        println(item)
    }
}