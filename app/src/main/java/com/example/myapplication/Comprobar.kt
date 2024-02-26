package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Comprobar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comprobar)

        supportFragmentManager.beginTransaction()
            .add(R.id.FMenuMain, Menu())
            .commit()

        val txtComprobar1 = findViewById<EditText>(R.id.txtComprobar1)
        val txtComprobar2 = findViewById<EditText>(R.id.txtComprobar2)
        val txtComprobarRes = findViewById<TextView>(R.id.txtComprobarFalse)

        val btnComprobar = findViewById<Button>(R.id.btnComprobar)
        val btnComprobarLogIn = findViewById<Button>(R.id.btnComprobarLogIn)


        var Bcomprobar: Boolean = false

        btnComprobar.setOnClickListener {


            if (txtComprobar1.text.toString() == txtComprobar2.text.toString()) {

                txtComprobarRes.text = "Comprobación correcta"
                Bcomprobar = true;

            } else {
                txtComprobarRes.text = "Comprobación incorrecta"
                Bcomprobar = false;

            }
        }

        btnComprobarLogIn.setOnClickListener {

            if(Bcomprobar == false){
                txtComprobarRes.text = "Comprueba si los datos introducidos són correctos"
            } else {
                val intent = Intent(this@Comprobar, Verificacion::class.java)
                startActivity(intent)
            }
        }
    }
}