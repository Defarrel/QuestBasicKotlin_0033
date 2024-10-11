package com.example.pam_tugas1

//Lamda Functions
//Lamda functions adalah fungsi yang tidak memiliki nama
//Lamda functions biasanya digunakan untuk membuat fungsi yang sederhana
//Lamda functions menggunakan tanda panah (->) untuk memisahkan parameter dan body fungsi

fun uppercaseString(string: String): String{
    return string.uppercase()
}

//dapat ditulis dalam ekspresi lamda sbb:
fun main(){
    uppercaseString("hello")
    println({string: String -> string.uppercase()}("Hello"))
    //Hello
}