package com.example.day16database

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class GuideOverWeight : AppCompatActivity() {
    private val follow = arrayOf(
        "Do Hard Work", "Lose Weight", "Stop Junk Food", "Follow Strict Diet", "Curious Mindset"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Enable edge-to-edge behavior
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContentView(R.layout.activity_guide_over_weight)

        val list2: ListView = findViewById(R.id.list2)
        Toast.makeText(this, "Rules to Follow", Toast.LENGTH_SHORT).show()

        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, follow)
        list2.adapter = arrayAdapter
    }
}
