package com.example.desafiomobile2you.data.repository

import com.example.desafiomobile2you.data.network.MovieService
import com.example.desafiomobile2you.domain.model.Movie
import com.example.desafiomobile2you.domain.repository.GetRecommendedRepository
import com.example.desafiomobile2you.util.Result

class GetMovieRecommendedRepositoryImpl(
    private val movieService: MovieService ) : GetRecommendedRepository {
    override suspend fun getRecommended(movieId: String): Result<List<Movie>> {
        val response = movieService.getRecommendedMovie(movieId = movieId)
        if(response.isSuccessful){
            response.body()?.let { movie ->
                return Result.Success(movie)
            }
        }
        return Result.Failure(Throwable("Error ${response.errorBody()} ${response.message()} "))

    }

}