package com.example.harvardartmuseumofc.AboutMuseum.Presentation

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.harvardartmuseumofc.R

class About2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_about2)

        val buttonPeople = findViewById<ImageButton>(R.id.buttonPeople)
        val buttonBack = findViewById<ImageButton>(R.id.buttonBack)

        buttonPeople.setOnClickListener {
            val intent = Intent(this, About3Activity::class.java)
            startActivity(intent)}

        buttonBack.setOnClickListener{
            val intent = Intent(this, AboutActivity:: class.java)
            startActivity(intent)}
    }
}