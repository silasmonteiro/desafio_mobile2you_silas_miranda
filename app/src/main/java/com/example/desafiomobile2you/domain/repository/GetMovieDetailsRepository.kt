package com.example.desafiomobile2you.domain.repository

import com.example.desafiomobile2you.domain.model.Movie

interface GetMovieDetailsRepository {

    fun getMovie() : Movie
}