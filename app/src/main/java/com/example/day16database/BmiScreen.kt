package com.example.day16database

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class BmiScreen : AppCompatActivity() {
    private lateinit var edtweight: EditText
    private lateinit var edtHeight: EditText
    private lateinit var edtHeightIn: EditText
    private lateinit var btn: Button
    private lateinit var txt: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false) // Enable edge-to-edge behavior
        setContentView(R.layout.activity_bmi_screen)

        edtweight = findViewById(R.id.edtweight)
        edtHeight = findViewById(R.id.edtHeight)
        edtHeightIn = findViewById(R.id.edtHeightIn)
        btn = findViewById(R.id.btn)
        txt = findViewById(R.id.txt)

        btn.setOnClickListener {
            val wt = edtweight.text.toString().toInt()
            val ft = edtHeight.text.toString().toInt()
            val inch = edtHeightIn.text.toString().toInt()

            val totalIn = ft * 12 + inch

            val totalCm = totalIn * 2.54
            val totalM = totalCm / 100

            val bmi = wt.toDouble() / (totalM * totalM)

            when {
                bmi > 25 -> {
                    txt.text = "You're overweight"
                    Handler().postDelayed({
                        val intent = Intent(this,holdsec::class.java)
                        startActivity(intent)
                        finish()
                    }, 2000)
                }
                bmi < 18.5 -> {
                    txt.text = "You are underweight"
                    Handler().postDelayed({
                        val intent = Intent(this,Holdthird::class.java)
                        startActivity(intent)
                        finish()
                    }, 2000)
                }
                else -> {
                    txt.text = "You're healthy"
                    Handler().postDelayed({
                        val intent = Intent(this,holder::class.java)
                        startActivity(intent)
                        finish()
                    }, 2000)
                }
            }
        }
    }
}
