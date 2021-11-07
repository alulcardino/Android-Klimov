package com.example.ravencounter

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var counter_raven: Int = 0;
    private var counter_cat: Int = 0;



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counter_cat_Text: TextView = findViewById(R.id.counter_cats)

        val counter_raven_Text: TextView = findViewById(R.id.counter_ravens)

        val button_counter_cat: Button = findViewById(R.id.button_counter_cat)
        button_counter_cat.setOnClickListener {
            counter_raven_Text.text = "Я насчитал ${++counter_cat} котов"

        }

        val button_counter_raven: Button = findViewById(R.id.button_counter_raven)
        button_counter_raven.setOnClickListener {
            counter_cat_Text.text = "Я насчитал ${++counter_raven} ворон"
        }



    }

}