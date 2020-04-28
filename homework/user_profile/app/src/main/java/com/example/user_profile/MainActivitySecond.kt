package com.example.user_profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main_second.*

class MainActivitySecond : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_second)
        init()
    }

    private fun init()
    {
        goToFinal.setOnClickListener{
            checkFields()
        }
    }

    private fun userInfoHere() {
        val intent = Intent(this, MainActivityThird::class.java)
        val user = User(
            editTextName.text.toString(),
            editTextLastName.text.toString(),
            editTextEmail.text.toString(),
            editTextAge.text.toString().toInt(),
            editTextGender.text.toString()
        )
        intent.putExtra("user", user)
        startActivity(intent)
    }

    private fun checkFields()
    {
        if (editTextName.text.isEmpty())
        {
            Toast.makeText(applicationContext, "\"Please, fill Name's field\"", Toast.LENGTH_SHORT).show()
        }
        else if (editTextLastName.text.isEmpty())
        {
            Toast.makeText(applicationContext, "\"Please, fill Lastname's field\"", Toast.LENGTH_SHORT).show()
        }
        else if (editTextEmail.text.isEmpty())
        {
            Toast.makeText(applicationContext, "\"Please, fill Mail's field\"", Toast.LENGTH_SHORT).show()
        }
        else if(editTextAge.text.isEmpty())
        {
            Toast.makeText(applicationContext, "\"Please, fill Age's field\"", Toast.LENGTH_SHORT).show()
        }
        else if (editTextGender.text.isEmpty())
        {
            Toast.makeText(applicationContext, "\"Please, fill Gender's field\"", Toast.LENGTH_SHORT).show()
        }

        else userInfoHere()
    }



}
