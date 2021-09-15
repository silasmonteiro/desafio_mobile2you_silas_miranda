package com.example.desafiomobile2you.domain.repository

import com.example.desafiomobile2you.domain.model.Movie
import com.example.desafiomobile2you.util.Result

interface GetRecommendedRepository {

    suspend fun getRecommended(movieId: String) : Result<List<Movie>>

}