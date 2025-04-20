package com.example.rockpaperscissors

fun main() {
    var computerChoice = ""
    var playerChoice = ""


    var playerChoiceIsIncorrect = true
    println("Rock, Paper or Scissors? Enter your choice!")

    while (playerChoiceIsIncorrect) {
        playerChoice = readln()
        playerChoiceIsIncorrect = when (playerChoice.lowercase()) {
            "rock" -> false
            "paper" -> false
            "scissors" -> false
            else -> true
        }
        if (playerChoiceIsIncorrect) {
            println("Please enter Rock, Paper or Scissors")
        } else {
            break;
        }

    }

    val randomNumber = (1..3).random()

    when (randomNumber) {
        1 -> {
            computerChoice = "Rock"
        }
        2 -> {
            computerChoice = "Paper"
        }
        3 -> {
            computerChoice = "Scissors"
        }
    }

    println(computerChoice)

    val winner = when {
        playerChoice.lowercase() == computerChoice.lowercase() -> "Tie"
        playerChoice.lowercase() == "rock" && computerChoice.lowercase() == "scissors" -> "Player"
        playerChoice.lowercase() == "paper" && computerChoice.lowercase() == "rock" -> "Player"
        playerChoice.lowercase() == "scissors" && computerChoice.lowercase() == "paper" -> "Player"
        else -> "Computer"
    }
    if (winner == "Tie") {
        println("It's a tie")
    } else {
        println("The winner is the $winner!")
    }


}