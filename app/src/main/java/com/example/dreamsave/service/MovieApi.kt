package com.example.dreamsave.service

import com.example.dreamsave.db.viewmodels.models.Movies

interface MovieApi {
    suspend fun getMovies() :Movies
}