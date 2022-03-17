package com.generation.exc_appdado_17_03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button6F= findViewById<Button>(R.id.button6f)
        val button12F = findViewById<Button>(R.id.button6f)
        val button20F = findViewById<Button>(R.id.button6f)

        button6F.setOnClickListener {
            rolarDados(6)
        }
        button12F.setOnClickListener {
            rolarDados(12)
        }
        button20F.setOnClickListener {
            rolarDados(20)
        }


    }

    fun rolarDados(faces:Int){
        val num = (1..faces).random()

        val result = findViewById<TextView>(R.id.result)

        result.text = faces.toString()

    }
}