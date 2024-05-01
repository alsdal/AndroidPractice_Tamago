package com.example.androidtest1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidtest1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var a : Int = 0;
        binding.buttonClick.setOnClickListener {
            a++
            binding.Number.setText("$a")
        }
        binding.buttonReset.setOnClickListener {
            a = 0
            binding.Number.setText("$a")
        }


    }
}