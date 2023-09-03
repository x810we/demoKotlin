package com.example.demokotlin

var myName:String = "Ingo"
var selection = "Papier"
var selectionEnemy = "Schere "

fun printing1 (text01: String) {
    println("Herlich willkommen zu unserem Spiel")
    println("Heutiger Spieler: $myName")

}
fun evaluateGame () {
    println("Deine Auswahl: $selection")
    println ("Dein Gegener: $selectionEnemy")
    if(selection == selectionEnemy) {
        println("Unentschieden")
    } else {
        if (selection == "Schere") {
            if(selectionEnemy == "Papier") {
                println ("Gewonnen!")
            } else {
                println ("Verloren")
            }
        }
    }
//
    if (selection == "Papier") {
        if (selectionEnemy == "Schere") {
            println("Verloren!")
        }
        else {
            println ("Gewonnen")
        }
    }

}

fun main(){
    var test = 1

    printing1(myName)
    evaluateGame()

}