package com.example.desafiomobile2you.domain.usecase

import com.example.desafiomobile2you.domain.model.Movie

class GetMovieDetailsUserCaseImpl(private val getMovieRepository: GetMovieDetailsUseCase): GetMovieDetailsUseCase{

    override fun getMovie(): Movie {
        TODO("Not yet implemented")
    }

}