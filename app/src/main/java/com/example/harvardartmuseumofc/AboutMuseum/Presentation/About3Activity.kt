package com.example.harvardartmuseumofc.AboutMuseum.Presentation

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.harvardartmuseumofc.Main.Presentation.MainActivity
import com.example.harvardartmuseumofc.R


class About3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_about3)

        val buttonHome = findViewById<ImageButton>(R.id.buttonHome)
        val buttonBack1 = findViewById<ImageButton>(R.id.buttonBack1)

        buttonHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent) }

        buttonBack1.setOnClickListener{
            val intent = Intent(this, About2Activity::class.java)
            startActivity(intent)
        }
    }
}