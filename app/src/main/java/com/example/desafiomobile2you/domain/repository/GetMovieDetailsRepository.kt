package com.example.desafiomobile2you.domain.repository

import com.example.desafiomobile2you.domain.model.Movie
import com.example.desafiomobile2you.util.Result

interface GetMovieDetailsRepository {

    suspend fun getMovie(movieId: String) : Result<Movie>
}