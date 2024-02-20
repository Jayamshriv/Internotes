package com.example.internshalatask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.internshalatask.databinding.FragmentLoginScreenBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : FragmentLoginScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentLoginScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().replace(R.id.container, LoginScreenFragment()).addToBackStack(null).commit()
    }
}