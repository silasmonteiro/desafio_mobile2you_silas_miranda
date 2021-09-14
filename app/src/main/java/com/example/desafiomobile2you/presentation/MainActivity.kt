package com.example.desafiomobile2you.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.desafiomobile2you.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.getMovieDetails()

    }
}


