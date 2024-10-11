package com.example.pam_tugas1

fun nullSafety(){
    // neverNull has String type
    var neverNull: String = "This can't be null"

    //Throws a compiler error
    //neverNull = null

    //nullable has nullable String type
    var nullable: String? = "You can keep a null here"

    //this is ok
    nullable = null

    //check for null in conditions
    if (neverNull == null){
        println("inferredNonNull is null")
    }else{
        println("inferredNonNull is not null")
    }

    //safe call operator
    println(neverNull.length) //18
    println(nullable?.length)// null

    //notnull doesnt accept null values
    fun strLength(notNull: String): Int{
        return notNull.length
    }

    println(strLength(neverNull))//18
}
