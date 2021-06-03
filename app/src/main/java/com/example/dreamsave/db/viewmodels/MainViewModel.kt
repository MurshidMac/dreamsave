package com.example.dreamsave.db.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dreamsave.db.viewmodels.models.Movies
import com.example.dreamsave.repository.Impl.MoviesImpl
import com.example.dreamsave.repository.MainRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel: ViewModel() {

    val textHello = "some text from viewmodel"
    private val mainRepository = MainRepository(MoviesImpl())

    val movieLiveData = MutableLiveData<Movies>()


    fun fetchMovie(){
        viewModelScope.launch {
            val movie = withContext(Dispatchers.IO){
                mainRepository.getMovies()
            }
            movieLiveData.value = movie
        }
    }
}