
package com.example.demokotlin

class Test01 {
}

fun printing (name: String) {
    println(name)

}

fun main() {
    var nameTest  = "Ingo"

    printing(nameTest)
    nameTest = "Thomas"
    println(nameTest)

}