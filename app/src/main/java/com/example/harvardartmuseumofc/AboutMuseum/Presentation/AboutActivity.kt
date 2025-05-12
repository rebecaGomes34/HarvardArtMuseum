package com.example.harvardartmuseumofc.AboutMuseum.Presentation

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.harvardartmuseumofc.Main.Presentation.MainActivity
import com.example.harvardartmuseumofc.R

    class AboutActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContentView(R.layout.activity_about)


            val buttonNext = findViewById<ImageButton>(R.id.buttonNext)
            val buttonHome1 = findViewById<ImageButton>(R.id.buttonHome1)

            buttonNext.setOnClickListener {
                val intent = Intent(this, About2Activity::class.java)
                startActivity(intent)
            }

            buttonHome1.setOnClickListener{
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent) }
        }
    }