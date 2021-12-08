package com.example.odinitog

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


        fun nextAc(view: View){

            val nextActv = Intent(this, SecondMainActivity2::class.java)

    startActivity(nextActv)
    }

    fun prevAct(view: android.view.View) {}
}