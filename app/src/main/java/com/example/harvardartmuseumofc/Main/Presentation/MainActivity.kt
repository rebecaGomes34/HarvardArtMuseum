package com.example.harvardartmuseumofc.Main.Presentation

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.example.harvardartmuseumofc.AboutMuseum.Presentation.AboutActivity
import com.example.harvardartmuseumofc.Favorites.Presentation.FatoriteActivity
import com.example.harvardartmuseumofc.R
import com.example.harvardartmuseumofc.tour.Presentation.ListTour.TourActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        setContentView(R.layout.activity_main)

        val aboutCard = findViewById<CardView>(R.id.AboutCard)
        val tourCard = findViewById<CardView>(R.id.tuorCard)
        val favoriteCard = findViewById<CardView>(R.id.favoriteCard)

        aboutCard.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)}

        tourCard.setOnClickListener{
            val intent = Intent(this, TourActivity::class.java)
            startActivity(intent)
        }

        favoriteCard.setOnClickListener{
            val intent = Intent(this, FatoriteActivity::class.java)
            startActivity(intent)
        }
    }
}
