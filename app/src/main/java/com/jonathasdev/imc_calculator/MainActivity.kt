package com.jonathasdev.imc_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular.setOnClickListener {

            val peso = peso.getText().toString().toDouble()
            val altura = altura.getText().toString().toDouble()

            val result = peso / (altura * altura)

            somaResult.text = "Seu IMC é ${"%.2f".format(result)}"

        }

    }
}