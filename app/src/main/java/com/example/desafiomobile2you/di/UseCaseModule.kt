package com.example.desafiomobile2you.di


import com.example.desafiomobile2you.domain.usecase.GetMovieDetailsUseCase
import com.example.desafiomobile2you.domain.usecase.GetMovieDetailsUserCaseImpl
import com.example.desafiomobile2you.domain.usecase.GetRecommendedUseCase
import com.example.desafiomobile2you.domain.usecase.GetRecommendedUseCaseImpl
import org.koin.dsl.module

val useCaseModule =  module {
    factory <GetMovieDetailsUseCase> { GetMovieDetailsUserCaseImpl(get()) }
    factory <GetRecommendedUseCase> { GetRecommendedUseCaseImpl(get())}

}
