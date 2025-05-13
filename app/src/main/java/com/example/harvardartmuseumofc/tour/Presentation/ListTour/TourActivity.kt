package com.example.harvardartmuseumofc.tour.Presentation.ListTour

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.harvardartmuseumofc.R

class TourActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tour)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerTour, ListFragment())
                .commit()
        }
    }
}