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


    fun onClickRock(button: View){
        openActivity("Rock")
    }
    fun onClickScissors(button: View){
        openActivity("Scissors")
    }
    fun onClickPaper(button: View){
        openActivity("Paper")
    }

    private fun openActivity(choice : String ) {
        val second = Intent(this, SecondActivity::class.java).apply {
           val bundle = Bundle().apply {
                putString("choice", choice)
            }
            putExtras(bundle)
        }
        startActivity(second)
    }



}