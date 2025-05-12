package com.example.harvardartmuseumofc.tour.Presentation.ListTour

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.harvardartmuseumofc.R
import com.example.harvardartmuseumofc.tour.Domain.TourInfo

class ImageListViewHolder (val view: View) : RecyclerView.ViewHolder(view) {

    fun bind(item: TourInfo) {
        val image: ImageView = view.findViewById(R.id.artImage)

        view.findViewById<TextView>(R.id.artAuthor).text = item.author

        Glide
            .with(view)
            .load(item.imageurl)
            .into(image)
    }
}
