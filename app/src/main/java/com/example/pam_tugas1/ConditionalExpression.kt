package com.example.pam_tugas1

import java.lang.NumberFormatException

// Conditional Expression
// Conditional expression adalah ekspresi yang mengembalikan nilai berdasarkan kondisi tertentu
// Conditional expression menggunakan if-else, when, dan try-catch

fun ConditionalStatment(){
    println("====Conditional Expression====")

    // If Else
    val number = 10
    if (number > 0) {
        println("positive number")
    }else
    {
        println("negative number")
    }

    //when
    val day = 1
    when (day){
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("Invalid day")
    }


    //Try-Catch
    val value = "10"
    try{
        val result = value.toInt()
        println("Result: $result")
    }catch (e: NumberFormatException){
        println("Invalid number")
    }
}

fun Perulangan(){
    println()
    println("===Perulangan====")

    for(i in 1..5){
        println("Perulangan ke-$i")
    }

    val cars = listOf("BMW", "Toyota", "Honda", "Audi")
    for (car in cars){
        println("Car type: $car")
    }

    var x = 1
    while (x <= 5){
        println("Perulangan ke-$x")
        x++
    }

    var y = 1
    do {
        println("Perulangan ke$y")
        y++
    }while (y <=5)
}
