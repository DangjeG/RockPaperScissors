package com.example.rockpaperscissors

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    override fun onStart() {
        super.onStart()
        /*val bundle = intent.extras
        val choiseOrdinal = bundle?.getInt(Choise::class.java.simpleName)
        choiseOrdinal ?: return
        val choise: Choise = Choise.values()[choiseOrdinal]
        val computerChoise = Choise.values()[Random.nextInt(Choise.values().size)]*/
    }
}