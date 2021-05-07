package com.example.tictactoe.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tictactoe.R
import com.example.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }
        setSupportActionBar(binding.toolbar)
    }
}