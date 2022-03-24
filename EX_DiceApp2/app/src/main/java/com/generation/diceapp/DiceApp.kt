package com.generation.diceapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DiceApp: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diceapp)

        val textIdent = findViewById<TextView>(R.id.textDado)
        val back = findViewById<Button>(R.id.Bback)
        val lancar = findViewById<Button>(R.id.Blancar)
        val ident = intent.getIntExtra("TIPO", 0)



        when (ident) {
            6 -> {
                textIdent.text = getString(R.string.d6)
                lancarDados(ident)

            }
            12 -> {

                textIdent.text = getString(R.string.d12)
                lancarDados(ident)

            }
            20 -> {

                textIdent.text = getString(R.string.d20)
                lancarDados(ident)

            }

        }

        lancar.setOnClickListener {
            lancarDados(ident)
        }


        back.setOnClickListener {
            finish()
        }

    }

    private fun lancarDados(valor: Int) {

        val lados = (1..valor).random()
        val txtResultado = findViewById<TextView>(R.id.textDado)

        txtResultado.text = lados.toString()

    }
}
