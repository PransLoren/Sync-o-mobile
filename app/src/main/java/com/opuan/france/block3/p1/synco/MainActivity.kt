package com.opuan.france.block3.p1.synco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton = findViewById<Button>(R.id.login)

        loginButton.setOnClickListener{
            val Intent = Intent(this,Homepage::class.java)
            startActivity(Intent)
        }
    }
}