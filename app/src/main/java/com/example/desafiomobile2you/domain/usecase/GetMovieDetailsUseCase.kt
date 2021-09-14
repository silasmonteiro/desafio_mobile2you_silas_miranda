package com.example.desafiomobile2you.domain.usecase

import com.example.desafiomobile2you.domain.model.Movie

interface GetMovieDetailsUseCase {

    fun getMovie(): Movie

}