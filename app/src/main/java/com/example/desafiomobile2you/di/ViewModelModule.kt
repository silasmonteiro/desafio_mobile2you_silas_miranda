package com.example.desafiomobile2you.di

import com.example.desafiomobile2you.presentation.MainViewModel
import org.koin.dsl.module

val viewModelModule = module {
    factory {MainViewModel(get())}
}