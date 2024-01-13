
package com.example.diceroller

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.diceroller.R

class MainActivity : AppCompatActivity() {

    private lateinit var rollButton: Button
    private lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollButton = findViewById(R.id.rollButton)
        diceImage = findViewById(R.id.diceImage)

        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val randomNumber = (1..6).random()
        val drawableResource = when (randomNumber) {
            1 -> R.drawable.dice_six_faces_one
            2 -> R.drawable.dice_six_faces_two
            3 -> R.drawable.dice_six_faces_three
            4 -> R.drawable.dice_six_faces_four
            5 -> R.drawable.dice_six_faces_five
            else -> R.drawable.dice_six_faces_six
        }

        diceImage.setImageResource(drawableResource)
    }
}
