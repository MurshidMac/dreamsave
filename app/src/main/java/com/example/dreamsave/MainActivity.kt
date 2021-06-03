package com.example.dreamsave

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.dreamsave.databinding.ActivityMainBinding
import com.example.dreamsave.db.viewmodels.MainViewModel
import com.example.dreamsave.db.viewmodels.models.Movies

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var viewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Get it from a provider and bind that value
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        viewModel.movieLiveData.observe(this){
            binding.tvDreamsave.text= it.toString()
        }
        viewModel.fetchMovie()
    }
}