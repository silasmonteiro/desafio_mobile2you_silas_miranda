package com.example.desafiomobile2you.domain.usecase

import com.example.desafiomobile2you.domain.model.Movie
import com.example.desafiomobile2you.domain.repository.GetRecommendedRepository
import com.example.desafiomobile2you.util.Result

class GetRecommendedUseCaseImpl(
    private val getRecommendedRepository: GetRecommendedRepository
    ): GetRecommendedUseCase {

       override suspend fun getRecommended(movieId: String): Result<List<Movie>> {
        return getRecommendedRepository.getRecommended(movieId = movieId)
    }
}