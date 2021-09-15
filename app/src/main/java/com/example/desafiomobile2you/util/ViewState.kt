package com.example.desafiomobile2you.util

class ViewState<T, S>(
    val data: T? = null,
    val status: S,
    val error: Throwable? = null
)