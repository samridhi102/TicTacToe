package com.example.tictactoe.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tictactoe.R
import com.example.tictactoe.databinding.ActivitySplashBinding

class SplashActivity:AppCompatActivity(R.layout.activity_main) {
    private lateinit var binding: ActivitySplashBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }

        

    }
}