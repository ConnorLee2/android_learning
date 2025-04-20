package com.example.bankaccountprogram

class BankAccount(var accountHolder: String, var balance: Double) {
    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double) {
        balance += amount
        transactionHistory.add("$accountHolder deposited $$amount")
    }

    fun withdraw(amount: Double) {
        if (amount <= balance) {
            // can withdraw
            balance -= amount
            transactionHistory.add("$accountHolder withdrew $$amount")
        } else {
            // cannot withdraw
            println("You don't have the funds to withdraw $$amount")
        }


    }

    fun displayTransactionHistory() {
        println("Transaction history for $accountHolder")
        for (transaction in transactionHistory) {
            println(transaction)
        }
    }

    fun acctBalance():Double {
        return balance
    }
}