package com.example.desafiomobile2you.util

import kotlinx.coroutines.Dispatchers
import kotlin.coroutines.CoroutineContext

open class DispatcherProvider {
    open val io: CoroutineContext by lazy { Dispatchers.IO }
    open val ui: CoroutineContext by lazy { Dispatchers.Main }
}