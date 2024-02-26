package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class Calculadora : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        supportFragmentManager.beginTransaction()
            .add(R.id.FMenuMain, Menu())
            .commit()


        val btnCalcular= findViewById<Button>(R.id.btnCalcular)

        val txtPrimerNum = findViewById<TextView>(R.id.txtPrimerNum)
        val txtSegundoNum = findViewById<TextView>(R.id.txtSegundoNum)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)


        btnCalcular.setOnClickListener {
            val num1 = txtPrimerNum.text.toString().toFloatOrNull() ?: 0f
            val num2 = txtSegundoNum.text.toString().toFloatOrNull() ?: 0f

            val resultado = num1 + num2

            txtResultado.text = resultado.toString()
        }
    }
}