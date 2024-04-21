package com.example.day16database

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class GuideHealthy : AppCompatActivity() {
    private val item = arrayOf(
        "Healthy Food", "Daily Exercise", "Avoid Junk Food", "Discipline", "Devotion"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false) // Enable edge-to-edge behavior
        setContentView(R.layout.activity_guide_healthy)

        val list2: ListView = findViewById(R.id.list2)
        Toast.makeText(this, "Follow it", Toast.LENGTH_SHORT).show()

        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)
        list2.adapter = arrayAdapter
    }
}
