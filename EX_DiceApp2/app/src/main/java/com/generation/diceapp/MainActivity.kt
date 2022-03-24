package com.generation.diceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnD6 = findViewById<Button>(R.id.d6)
        val btnD12 = findViewById<Button>(R.id.d12)
        val btnD20 = findViewById<Button>(R.id.d20)
        val intentDados = Intent(this, DiceApp::class.java)

        btnD6.setOnClickListener {
            intentDados.putExtra("TIPO", 6)
            startActivity(intentDados)
        }

        btnD12.setOnClickListener {
            intentDados.putExtra("TIPO", 12)
            startActivity(intentDados)

        }

        btnD20.setOnClickListener {
            intentDados.putExtra("TIPO", 20)
            startActivity(intentDados)
        }
    }
}