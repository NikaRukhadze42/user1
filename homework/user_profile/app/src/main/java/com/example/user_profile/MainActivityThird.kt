package com.example.user_profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_third.*

class MainActivityThird : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_third)
        init()
    }

    private fun init() {
        val user : User = intent.extras!!.getParcelable<User>("user")!!
        textViewName1.text = user!!.name.toString()
        textViewLastName1.text = user!!.lastname.toString()
        textViewEmail1.text = user!!.email.toString()
        textViewAge1.text = user!!.age.toString()
        textViewGender1.text=user!!.gender.toString()
    }
}