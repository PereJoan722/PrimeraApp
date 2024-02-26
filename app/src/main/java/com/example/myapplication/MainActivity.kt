package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.myapplication.Funcions
import com.example.myapplication.Funcions.toCalculadora


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnToComprobar= findViewById<Button>(R.id.btntoComprobar)

        val btnToInfo= findViewById<Button>(R.id.btntoInfo)



        btnToComprobar.setOnClickListener {
            val intent = Intent(this@MainActivity, Comprobar::class.java)
            startActivity(intent)
        }

        btnToInfo.setOnClickListener {
            val intent = Intent(this@MainActivity, Informacion::class.java)
            startActivity(intent)
        }




    }
}