package com.example.listasandroid18_11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerNome: RecyclerView = findViewById(R.id.recyclerNome)
        recyclerNome.layoutManager = LinearLayoutManager(this)


    }
}