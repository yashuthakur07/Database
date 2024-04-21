package com.example.day16database

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class GuideUnderweight : AppCompatActivity() {
    private val actions = arrayOf(
        "Proper Diet", "Discipline Life", "Regular Exercise",
        "Meditation", "Spirituality", "Socially Indulge", "Contribute in National Heritage"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guide_underweight)

        val list: ListView = findViewById(R.id.list)
        Toast.makeText(this, "Follow These Rules!!", Toast.LENGTH_SHORT).show()

        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, actions)
        list.adapter = arrayAdapter
    }
}
