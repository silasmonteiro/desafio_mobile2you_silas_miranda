package com.example.desafiomobile2you.domain.usecase

import com.example.desafiomobile2you.domain.model.Movie
import com.example.desafiomobile2you.util.Result

interface GetMovieDetailsUseCase {

   suspend fun getMovie(movieId: String): Result<Movie>

}