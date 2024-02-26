package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Verificacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verificacion)

        val btntoMain = findViewById<ImageButton>(R.id.btntoMain)

        btntoMain.setOnClickListener {
            val intent = Intent(this@Verificacion, MainActivity::class.java)
            startActivity(intent)
        }

    }
}