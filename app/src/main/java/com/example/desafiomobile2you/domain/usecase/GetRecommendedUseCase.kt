package com.example.desafiomobile2you.domain.usecase

import com.example.desafiomobile2you.domain.model.Movie
import com.example.desafiomobile2you.util.Result

interface GetRecommendedUseCase {

        suspend fun getRecommended(movieId: String): Result<List<Movie>>
}