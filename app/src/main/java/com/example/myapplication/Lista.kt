package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Lista : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        supportFragmentManager.beginTransaction()
            .add(R.id.FMenuMain, Menu())
            .commit()





    }
}