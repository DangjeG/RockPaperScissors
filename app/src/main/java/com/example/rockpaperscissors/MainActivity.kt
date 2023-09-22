package com.example.rockpaperscissors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun onClick(view: View?) {
        val button = view as? ImageButton
        button ?: return
        val v = findViewById<TextView>(R.id.textView)
        v.text = button.id.toString()
        val second = Intent(this, SecondActivity::class.java).apply {
           val bundle = Bundle().apply {
                putInt("choice", button.id)
            }
            putExtras(bundle)
        }
        startActivity(second)
    }
}