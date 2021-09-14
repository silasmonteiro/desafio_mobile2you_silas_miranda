package com.example.desafiomobile2you.presentation

import com.example.desafiomobile2you.base.BaseViewModel
import com.example.desafiomobile2you.domain.usecase.GetMovieDetailsUseCase
import com.example.desafiomobile2you.util.DispatcherProvider
import com.example.desafiomobile2you.util.Result
import kotlinx.coroutines.launch



class MainViewModel(
    private val getMovieDetailsUseCase: GetMovieDetailsUseCase,
    private val dispatcherProvider: DispatcherProvider
) : BaseViewModel(dispatcherProvider) {


    fun getMovieDetails() {


        scope.launch(dispatcherProvider.io) {
            when (val response = getMovieDetailsUseCase.getMovie(MOVIE_ID)) {
                is Result.Success -> {
                    response.data.let {

                    }
                }
                is Result.Failure -> {

                }

            }
        }

    }
    companion object {
        const val MOVIE_ID = "205596"
    }

}