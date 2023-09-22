package com.example.rockpaperscissors

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    override fun onStart() {
        val pc = findViewById<ImageView>(R.id.imageViewPC)
        val usr = findViewById<ImageView>(R.id.imageViewPlayer)
        val ret = findViewById<TextView>(R.id.TextViewRestart)
        super.onStart()
        val bundle = intent.extras
        val choicePlayer = bundle?.getString("choice")
        val choicePC = getRandom()
        choicePlayer ?: return
        setImage(choicePC, pc)
        setImage(choicePlayer, usr)
        ret.text = getRes(choicePlayer, choicePC)

    }

    private fun  getRandom() : String{
        return listOf("Rock","Paper","Scissors" ).random()
    }

    private fun setImage(choice: String, view: ImageView){
        when{
            choice == "Rock" ->{view.setImageDrawable(getResources().getDrawable(R.drawable.rock))}
            choice == "Paper" ->{view.setImageDrawable(getResources().getDrawable(R.drawable.paper))}
            choice == "Scissors" ->{view.setImageDrawable(getResources().getDrawable(R.drawable.scissors))}
        }
    }

    private fun getRes(usr:String, pc:String): String{
        if((usr == "Rock" && pc == "Paper")
            || (usr == "Paper" && pc == "Scissors")
            ||(usr == "Scissors" && pc == "Rock")) return "Поражение"
        else if ((usr == "Paper" && pc == "Rock")
            || (usr == "Scissors" && pc == "Paper")
            ||(usr == "Rock" && pc == "Scissors")) return "Победа"
        else return "Ничья"
    }


}