package com.example.desafiomobile2you.util.extension

fun String.createImagePath() : String {

    return "https://image.tmdb.org/t/p/w400/${this}"

}