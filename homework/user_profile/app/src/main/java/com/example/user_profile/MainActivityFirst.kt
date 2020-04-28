package com.example.user_profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_third.*

class MainActivityFirst : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init()
    {
        goToFirstSplash.setOnClickListener{openFirstSplash()}
    }

    private fun openFirstSplash()
    {
        val intent = Intent(this,FirstSplashScreen::class.java)
        startActivity(intent)
    }


}