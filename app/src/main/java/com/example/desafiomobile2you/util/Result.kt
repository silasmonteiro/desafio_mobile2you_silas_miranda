package com.example.desafiomobile2you.util


sealed class Result<out T> {
    class Success<out T>(val data: T) : Result<T>()
    class Failure(val throwable: Throwable) : Result<Nothing>()
}
