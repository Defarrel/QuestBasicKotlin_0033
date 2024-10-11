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

