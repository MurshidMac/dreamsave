package com.example.dreamsave.repository

import com.example.dreamsave.db.viewmodels.models.Movies
import com.example.dreamsave.service.MovieApi

class MainRepository (private val movieApi:MovieApi){
    suspend fun getMovies(): Movies{
        return movieApi.getMovies()
    }
}