package com.example.desafiomobile2you.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.desafiomobile2you.base.BaseViewModel
import com.example.desafiomobile2you.domain.model.Movie
import com.example.desafiomobile2you.domain.usecase.GetMovieDetailsUseCase
import com.example.desafiomobile2you.domain.usecase.GetRecommendedUseCase
import com.example.desafiomobile2you.util.*
import kotlinx.coroutines.launch



class MainViewModel(
    private val getMovieDetailsUseCase: GetMovieDetailsUseCase,
    private val dispatcherProvider: DispatcherProvider,
    private val getRecommendedUseCase: GetRecommendedUseCase
) : BaseViewModel(dispatcherProvider) {

    private val _movieLiveData = MutableLiveData<ViewState<Movie, ResponseStatus>>()
    val  movieLiveData: LiveData<ViewState<Movie, ResponseStatus>> = _movieLiveData

    private val _recommendedLiveData = MutableLiveData<ViewState<List<Movie>, ResponseStatus>>()
    val recommendedLiveData: LiveData<ViewState<List<Movie>, ResponseStatus>> = _recommendedLiveData

    fun getMovieDetails() {


        scope.launch(dispatcherProvider.io) {
            when (val response = getMovieDetailsUseCase.getMovie(MOVIE_ID)) {
                is Result.Success -> {
                    response.data.let { movie ->
                        _movieLiveData.postValue(
                            ViewState(
                                movie,
                                ResponseStatus.SUCCESS
                            )
                        )
                    }
                }
                is Result.Failure -> {
                    _movieLiveData.postValue(
                        ViewState(
                            null,
                            ResponseStatus.ERROR,
                            response.throwable
                        )
                    )

                }

            }
        }

    }

    fun getMovieRecommended(movieId: String) {

        scope.launch(dispatcherProvider.io) {
            when (val response = getRecommendedUseCase.getRecommended(movieId)) {
                is Result.Success -> {
                    response.data?.results?.let { movie ->
                        _recommendedLiveData.postValue(
                            ViewState(
                                movie,
                                ResponseStatus.SUCCESS
                            )
                        )
                    }
                }
                is Result.Failure -> {
                    _recommendedLiveData.postValue(
                        ViewState(
                            null,
                            ResponseStatus.ERROR,
                            response.throwable
                        )
                    )

                }

            }
        }

    }
    companion object {
        const val MOVIE_ID = "205596"
    }

}


