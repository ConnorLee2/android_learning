package com.example.kotlinbasics

class Dog (val name: String, val breed: String, var age: Int = 0){


    init {
        bark()
    }

    private fun bark() {
        println("$name says Woof Woof")
    }
}