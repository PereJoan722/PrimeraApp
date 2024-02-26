package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Informacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacion)

        val btntoMain = findViewById<ImageButton>(R.id.imgbtntoMain)

        btntoMain.setOnClickListener {
            val intent = Intent(this@Informacion, MainActivity::class.java)
            startActivity(intent)
        }



    }
}