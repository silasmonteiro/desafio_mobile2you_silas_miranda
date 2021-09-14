package com.example.desafiomobile2you.data.repository

import com.example.desafiomobile2you.data.network.MovieService
import com.example.desafiomobile2you.domain.model.Movie
import com.example.desafiomobile2you.domain.repository.GetMovieDetailsRepository
import com.example.desafiomobile2you.util.Result

class GetMovieDetailsRepositoryImpl(private val movieService: MovieService) : GetMovieDetailsRepository {

      override suspend fun getMovie(movieId: String): Result<Movie> {
     val response = movieService.getMovieDetails(movieId = movieId)
          if(response.isSuccessful){
              response.body()?.let { movie ->
                  return Result.Success(movie)
              }
          }
          return Result.Failure(Throwable("Error ${response.errorBody()} ${response.message()} "))

    }
}