package com.example.taskcreator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Botões Radio
        val ativarDaily: RadioButton = findViewById(R.id.RadioDailyButton)
        val ativarTask: RadioButton = findViewById(R.id.RadioTaskButton)
        val ativarMetas: RadioButton = findViewById(R.id.RadioMetasButton)

        ativarDaily.setOnClickListener{

            ativarTask.isChecked = false
            ativarMetas.isChecked = false

        }

        ativarTask.setOnClickListener{

            ativarDaily.isChecked = false
            ativarMetas.isChecked = false

        }

        ativarMetas.setOnClickListener{

            ativarTask.isChecked = false
            ativarDaily.isChecked = false

        }
        // Botões Radio

    }
}