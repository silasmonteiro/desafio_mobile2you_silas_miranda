package com.example.desafiomobile2you.data.network

import com.example.desafiomobile2you.domain.model.Movie
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

const val API_KEY = "b9a814f64ab6b4c56d504e1dbed36b8b"

interface MovieService {

    @GET("movie/{movie_id}")
    suspend fun getMovieDetails(
        @Path("movie_id") movieId: String,
        @Query("api_key") api_key: String = API_KEY
    ): Response<Movie>

    @GET("movie/{movie_id}/similar")
    suspend fun getRecommendedMovie(
        @Path("movie_id") movieId: String,
        @Query("api_key") api_key: String = API_KEY
    ): Response<List<Movie>>
}

