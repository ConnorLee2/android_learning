package com.example.bankaccountprogram

fun main() {
    val deniseBankAccount = BankAccount("Denis Panjuta", 1300.03)

    deniseBankAccount.deposit(200.0)
    deniseBankAccount.withdraw(1200.0)
    deniseBankAccount.deposit(3000.0)
    deniseBankAccount.deposit(2000.0)
    deniseBankAccount.withdraw(3333.15)
    deniseBankAccount.displayTransactionHistory()
    println(deniseBankAccount.accountHolder + "'s balance is " + deniseBankAccount.acctBalance())

    var sarahBankAccount = BankAccount("Sarah", 0.0)
    sarahBankAccount.deposit(100.0)
    sarahBankAccount.withdraw(10.0)
    sarahBankAccount.deposit(300.0)
    sarahBankAccount.displayTransactionHistory()
    println(sarahBankAccount.accountHolder + "'s balance is " + sarahBankAccount.acctBalance())
}