package com.example.novosrecursos18_11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.novosrecursos18_11.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.botaoGerar.setOnClickListener{

            val nome = binding.campoDeInput.text.toString()
            binding.TextResult.text = "Olá, meu nome é $nome"

        }

    }
}