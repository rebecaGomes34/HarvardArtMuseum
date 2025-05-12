package com.example.harvardartmuseumofc.tour.Presentation.ListTour

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.harvardartmuseumofc.R
import com.example.harvardartmuseumofc.tour.Domain.TourInfo

class ArtListAdapter(val itemList: List<TourInfo>, val callback: (String) -> Unit)
    : RecyclerView.Adapter<ImageListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageListViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_tour, parent, false)

        return ImageListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageListViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

    override fun getItemCount(): Int = itemList.size
}