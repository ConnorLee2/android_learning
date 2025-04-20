package com.example.kotlinbasics

data class CoffeeDetails(
    val sugarCount: Int,
    val name: String,
    var size: String,
    val creamAmount: Int
)

fun main () {
    val coffeeForDenis = CoffeeDetails(0, "denis", "xxl", 0)
    makeCoffee(coffeeForDenis)

}

fun askCoffeeDetails(){
    println("Who is this coffee for?")
    val name = readln()
    println("How many pieces of sugar do you want?")
    val sugarCount = readln()
    val sugarCountInt = sugarCount.toInt()
}

fun makeCoffee(coffeeDetails: CoffeeDetails) {
    when (coffeeDetails.sugarCount) {
        0 -> {
            println("Coffee with no sugar for ${coffeeDetails.name}")
        }
        1 -> {
            println("Coffee with ${coffeeDetails.sugarCount} spoon of sugar for ${coffeeDetails.name}")
        }
        else -> {
            println("Coffee with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.name}")
        }
    }
}

fun arithmetic() {
    val num1 = readln()
    val num2 = readln()

    val result = add(num1.toInt(), num2.toInt())
    println("The result of $num1 + $num2 is: $result")
    val myResult = divide(num1.toDouble(), num2.toDouble())
    println("The result of $num1 / $num2 is: $myResult")
}

fun add(num1: Int, num2: Int):Int {
    val result = num1 + num2

    return result
}

fun divide(num1: Double, num2: Double):Double {
    val result = num1/num2
    return result
}

fun dogStuff() {
    var daisy = Dog("Daisy", "Dwarf poodle", 1)
    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old")
    daisy.age = 2
    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old")
}