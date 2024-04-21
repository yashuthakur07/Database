package com.example.day16database

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class holder : AppCompatActivity() {
    private lateinit var routine: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false) // Enable edge-to-edge behavior
        setContentView(R.layout.activity_holder)

        routine = findViewById(R.id.routine)

        routine.setOnClickListener {
            val intent = Intent(this@holder, GuideHealthy::class.java)
            startActivity(intent)
        }
    }
}
