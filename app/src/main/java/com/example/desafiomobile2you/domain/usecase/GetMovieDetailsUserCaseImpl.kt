package com.example.desafiomobile2you.domain.usecase

import com.example.desafiomobile2you.domain.model.Movie
import com.example.desafiomobile2you.domain.repository.GetMovieDetailsRepository
import com.example.desafiomobile2you.util.Result

class GetMovieDetailsUserCaseImpl(
    private val getMovieDetailsRepository: GetMovieDetailsRepository
    ): GetMovieDetailsUseCase{

    override suspend fun getMovie(movieId: String): Result<Movie> {
       return getMovieDetailsRepository.getMovie(movieId = movieId)
    }

}