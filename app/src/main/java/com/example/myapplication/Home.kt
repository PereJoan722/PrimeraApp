package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView


class Home : AppCompatActivity() {

    private lateinit var imgFotoPersona: ImageView
    private lateinit var arrayImagenes: Array<ImageView>

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        supportFragmentManager.beginTransaction()
            .add(R.id.FMenuMain, Menu())
            .commit()









    }





}