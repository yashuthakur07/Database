package com.example.day16database

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class holdsec : AppCompatActivity() {
    private lateinit var guide11: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false) // Enable edge-to-edge behavior
        setContentView(R.layout.activity_holdsec)

        guide11 = findViewById(R.id.guide11)

        guide11.setOnClickListener {
            val intent = Intent(this@holdsec, GuideOverWeight::class.java)
            startActivity(intent)
        }
    }
}

