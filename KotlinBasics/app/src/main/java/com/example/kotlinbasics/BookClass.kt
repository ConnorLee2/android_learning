package com.example.kotlinbasics

fun main() {
    var myBook = Book()
    println("${myBook.title}, ${myBook.author}, ${myBook.yearPublished}")
    var customBook = Book("Custom Book", "New Author", 1994)
    println("${customBook.title}, ${customBook.author}, ${customBook.yearPublished}")
}