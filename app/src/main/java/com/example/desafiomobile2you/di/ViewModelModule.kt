package com.example.desafiomobile2you.di

import com.example.desafiomobile2you.presentation.MainViewModel
import com.example.desafiomobile2you.util.DispatcherProvider
import org.koin.dsl.module

val viewModelModule = module {
    factory { DispatcherProvider() }
    factory {MainViewModel(get(),get(),get())}

}