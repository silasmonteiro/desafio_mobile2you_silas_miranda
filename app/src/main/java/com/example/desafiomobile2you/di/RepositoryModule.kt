package com.example.desafiomobile2you.di

import com.example.desafiomobile2you.data.repository.GetMovieDetailsRepositoryImpl
import com.example.desafiomobile2you.data.repository.GetMovieRecommendedRepositoryImpl
import com.example.desafiomobile2you.domain.repository.GetMovieDetailsRepository
import com.example.desafiomobile2you.domain.repository.GetRecommendedRepository
import org.koin.dsl.module

val repositoryModule = module {
    factory <GetMovieDetailsRepository>{ GetMovieDetailsRepositoryImpl(get())}
    factory <GetRecommendedRepository>{ GetMovieRecommendedRepositoryImpl(get()) }
}