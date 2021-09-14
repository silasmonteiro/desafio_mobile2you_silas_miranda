package com.example.desafiomobile2you.di

import com.example.desafiomobile2you.domain.usecase.GetMovieDetailsUseCase
import com.example.desafiomobile2you.domain.usecase.GetMovieDetailsUserCaseImpl
import org.koin.dsl.module

val useCaseModule =  module {
    factory<GetMovieDetailsUseCase> { GetMovieDetailsUserCaseImpl(get()) }
}