package com.example.jacopoxu_rollthedice

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)

        var random = intent.getIntExtra("RANDOM")
        var textView = findViewById<TextView>(R.id.textViewActivityThird)

        if(random == 4) {
            textView.text = "Hai vinto!!!"
        }
        else {
            textView.text = "Hai perso"
        }


        var imageViewSecond = findViewById<ImageView>(R.id.imageViewActivityThird)

    }
    }
}