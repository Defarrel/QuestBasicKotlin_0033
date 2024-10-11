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

