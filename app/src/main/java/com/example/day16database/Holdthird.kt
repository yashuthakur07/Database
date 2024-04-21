package com.example.day16database

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class Holdthird : AppCompatActivity() {
    private lateinit var check3: Button
    private lateinit var main: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false) // Enable edge-to-edge behavior
        setContentView(R.layout.activity_holdthird)

        check3 = findViewById(R.id.check3)

        check3.setOnClickListener {
            val intent = Intent(this@Holdthird, GuideUnderweight::class.java)
            startActivity(intent)
        }
    }
}
