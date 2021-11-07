package com.example.lighttraffic

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rootLayout: ConstraintLayout = findViewById(R.id.root_layout)
        val textView: TextView = findViewById(R.id.textView)
        val redButton: Button = findViewById(R.id.button_1)
        val yellowButton: Button = findViewById(R.id.button_2)
        val greenButton: Button = findViewById(R.id.button_3)

        redButton.setOnClickListener {
            textView.text = "Красный";
            rootLayout.setBackgroundColor(resources.getColor(R.color.redColor, null))
        }

        yellowButton.setOnClickListener {
            textView.text = "Желтый";
            rootLayout.setBackgroundColor(resources.getColor(R.color.yellowColor, null))
        }

        greenButton.setOnClickListener {
            textView.text = "Зеленый";
            rootLayout.setBackgroundColor(resources.getColor(R.color.greenColor, null))
        }
    }
}