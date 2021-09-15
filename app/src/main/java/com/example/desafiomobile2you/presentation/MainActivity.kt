package com.example.desafiomobile2you.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import com.example.desafiomobile2you.R
import com.example.desafiomobile2you.domain.model.Movie
import com.example.desafiomobile2you.util.ResponseStatus
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupObserverViewState(viewModel)
        viewModel.getMovieDetails()

    }

    private fun setupObserverViewState(viewModel: MainViewModel) {
        viewModel.movieLiveData.observe(this, Observer { viewState ->
            when (viewState.status) {

                ResponseStatus.SUCCESS -> setupView(viewState.data)
                ResponseStatus.ERROR -> showMessageError(viewState.error)
            }
        })
    }

    private fun showMessageError(error: Throwable?) {
        error?.localizedMessage.let{
            Toast.makeText(this,it,Toast.LENGTH_LONG).show()
        }

    }

    private fun setupView(movie: Movie?) {

        tv_titulo.text = movie?.title
        tv_qtdlikes.text = movie?.voteCount.toString()
        tv_qtdassistidos.text = movie?.popularity.toString()

    }
}


