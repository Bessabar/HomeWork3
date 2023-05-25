package com.example.homework3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ProfileActivity : AppCompatActivity() {

    private lateinit var updatePasswordBtn : Button
    private lateinit var exitBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        init()
        listeners()
    }

    private fun init(){

        updatePasswordBtn = findViewById(R.id.updatePasswordBtn)
        exitBtn = findViewById(R.id.exitBtn)
    }

    private fun listeners(){

        updatePasswordBtn.setOnClickListener {
            startActivity(Intent(this, UpdatePasswordActivity::class.java))
            finish()
        }

        exitBtn.setOnClickListener {
            finish()

        }
    }
}