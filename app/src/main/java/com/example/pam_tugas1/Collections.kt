package com.example.pam_tugas1

// list adalah kumpulan data yang disusun secara berurutan dari
// list bersifat ordered, artinya data yang dimasukan akan memiliki posisii seusai urutan
// list bersifat mutable dan read only, artinya data yang dimasukan dapar diubah dan tidak dapat diubah
// list read-only menggunakan listOf
// list mutable menggunakan mutableListOf

fun ContohList(){
    println("===List===")
    //List read-Only
    val readOnlyAbjad = listOf("A","B","C")
    println(readOnlyAbjad)

    //List mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square","Triangle")
    println(shape)

    //Menambahkan data ke dalam list mutable
    shape.add("circle")
    println(shape)

    //Menghapus data dari list mutable
    shape.remove("Triangle")
    println(shape)

    //Mengubah data dalam list mutable
    shape[0] = "Oval"
    println(shape)

    val shapesLocked: List<String> = shape
    println(shapesLocked)
}

// set adalah kumpulan data yang tidak memiliki posisi atau urutan tertentu dan hanya menyimpan data unik(tidak ada duplikasi)
// set bersifat unordered, artinya data yang dimasukan tidak memiliki posisi tertentu
// set bersifat mutable dan read only, artina data yang dimasukan dapat diubah dan tidak dapat diubah
// set read-only menggunakan serOf
// set mutable menggunakan mutableSetOf

fun ContohSet(){
    println()
    println("===Set===")

    //set read-only
    val readOnlyAbjad = setOf("A","B","B")
    println(readOnlyAbjad)

    //set mutable
    val shape: MutableSet<String> = mutableSetOf("Circle", "Square","Triangle")
    println(shape)

    //Menambahkan data ke dalam set mutable
    shape.add("Rectangle")
    println(shape)

    //Menghapus data dari set mutable
    shape.remove("Circle")
    println(shape)

    //set read-only
    val shapesLocked: Set<String> = shape
    println(shapesLocked)
}


// map adalah kumpulan data yang disusun dalam pasangan key-value
// map bersifat unordered, artinya data yang dimasukan tidak memiliki posisi tertentu
// map bersifat mutable dan read only, artinya data yang dimasukan dapat diubah dan tidak dapat diubah
// map read-only menggunakan mapOf
// map mutable menggunakan mutableMapOf

fun ContohMap(){
    println()
    println("===Map===")
    //Map read only
    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(readOnlyShape)

    //Map mutable
    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(shape)

    //Menambahkan data ke dalam mutable
    shape["Rectangle"] = 4
    println(shape)

    //Menghapus data dari map mutlable
    shape.remove("Circle")
    println(shape)

    //Mengubah data di dalam map mutable
    shape["Square"] = 5
    println(shape)

    //Map read-only
    val shapesLocked: Map<String, Int> = shape
    println(shapesLocked)
}

