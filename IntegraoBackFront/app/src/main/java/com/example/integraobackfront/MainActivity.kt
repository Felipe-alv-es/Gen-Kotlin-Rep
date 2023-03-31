package com.example.integraobackfront

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val buttonClique: Button = findViewById(R.id.buttonClique)
//        var textResultado: TextView = findViewById(R.id.textResultado)
//        var cont = 0
//
//        buttonClique.setOnClickListener{
//            cont++
//            textResultado.text = "Clicou $cont vezes"
//        }


        val rolarDados: Button = findViewById(R.id.rolarDados)

        rolarDados.setOnClickListener{

            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            toast.show()
            jogarDados()

        }


    }

    private fun jogarDados() {
        val dice = Dice(6)
        val diceRoll = dice.roll()

        val diceImage: ImageView = findViewById(R.id.DiceImage)

        when (diceRoll){

            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)

        }

    }
}

class Dice(val numLados: Int)
{

    fun roll(): Int
    {
        return (1 .. numLados).random()
    }

}