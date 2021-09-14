package com.example.desafiomobile2you.data.network

import com.example.desafiomobile2you.domain.model.Movie
import retrofit2.http.GET
import retrofit2.http.Path

interface MovieService {

    @GET("movie/{movie_id}")
    suspend fun getMovieDetails(@Path("movie_id") movieId: Int): Movie
}