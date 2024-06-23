package com.example.loginapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_second : AppCompatActivity() {
    private lateinit var binding:ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)

        setContentView(R.layout.activity_second)

        val bundle = intent.extras!!
        val result1 = bundle.getString(key:"username")
        val result2 = bundle.getString(key:"password")
        binding.userNameTextView.text = result1
        binding.userNameTextView.text = result2

        }
    }
}