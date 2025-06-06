package com.example.jacopoxu_rollthedice

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        var msg = intent.getStringExtra("MESSAGE")
        val textView = findViewById<TextView>(R.id.textViewActivitySecond)
        textView.text = msg

        var imageViewSecond = findViewById<ImageView>(R.id.imageViewActivitySecond)
        var random = intent.getIntExtra("RANDOM", -1)

        var resource = when (random) {
            1 -> R.drawable.dice_face_1
            2 -> R.drawable.dice_face_2
            3 -> R.drawable.dice_face_3
            4 -> R.drawable.dice_face_4
            5 -> R.drawable.dice_face_5
            6 -> R.drawable.dice_face_6
            else -> {R.drawable.dices}
        }
        imageViewSecond.setImageResource(resource)
        Log.d("SECOND", "FINITO DISEGNO DADO")

        var mioIntent : Intent = Intent(this, ThirdActivity::class.java)
        mioIntent.putExtra("RANDOM", random)
        startActivity(mioIntent)
        }
    }