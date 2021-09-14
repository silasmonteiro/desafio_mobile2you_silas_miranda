package com.example.desafiomobile2you.data.repository

import com.example.desafiomobile2you.data.network.MovieService
import com.example.desafiomobile2you.domain.model.Movie
import com.example.desafiomobile2you.domain.repository.GetMovieDetailsRepository

class GetMovieDetailsRepositoryImpl(private val movieService: MovieService) : GetMovieDetailsRepository {
    override fun getMovie(): Movie {

    }


}