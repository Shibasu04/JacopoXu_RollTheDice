package com.example.jacopoxu_rollthedice

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var btnRoll : Button = findViewById(R.id.buttonRoll)
        btnRoll.setOnClickListener(View.OnClickListener{
            var toast = Toast.makeText(this, "lancio del dado", Toast.LENGTH_LONG)
            toast.show()

            var mioIntent : Intent = Intent(this, SecondActivity::class.java)
            var mioRandom = (1..6).random()
            mioIntent.putExtra("MESSAGE", "Numero Estratto: $mioRandom")
            mioIntent.putExtra("RANDOM", mioRandom)
            startActivity(mioIntent)
            Log.d("FIRST","MAIN ACTIVITY TERMINATO")
        })



        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/
    }
}