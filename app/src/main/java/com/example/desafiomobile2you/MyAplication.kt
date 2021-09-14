package com.example.desafiomobile2you

import android.app.Application
import android.content.Context
import com.example.desafiomobile2you.di.networkModule
import com.example.desafiomobile2you.di.repositoryModule
import com.example.desafiomobile2you.di.useCaseModule
import com.example.desafiomobile2you.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module

open class MyAplication : Application() {

    override fun onCreate() {
        super.onCreate()
        setupApp(baseContext)
    }

    private fun setupApp(context: Context) {

        startKoin{
            androidContext(context)
            modules(
                listOf(
                    useCaseModule,
                    viewModelModule,
                    repositoryModule,
                    networkModule
                )
            )

        }

    }
}