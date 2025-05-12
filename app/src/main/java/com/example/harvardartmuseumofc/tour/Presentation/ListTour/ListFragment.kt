package com.example.harvardartmuseumofc.tour.Presentation.ListTour

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.harvardartmuseumofc.R
import com.example.harvardartmuseumofc.tour.Data.HamInfoRepositoryImpl
import com.example.harvardartmuseumofc.tour.Data.HamService
import com.example.harvardartmuseumofc.tour.Domain.GetHamUseCase
import com.example.harvardartmuseumofc.tour.hamRetrofit


class ListFragment : Fragment() {

    private val viewModel: TourViewModel by lazy {
        ViewModelProvider(
            this,
            TourViewModel.Factory(
                GetHamUseCase(
                    HamInfoRepositoryImpl(
                        hamRetrofit.create(HamService::class.java)
                    )
                )
            )
        ).get(TourViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.activity_tour, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.artRecyclerView)

        recyclerView.adapter = ArtListAdapter(emptyList()){}
        viewModel.hamInfoLiveData.observe(viewLifecycleOwner) {

            recyclerView.adapter = ArtListAdapter(it) { tourName ->
                Toast.makeText(context, "Clicou em: $tourName", Toast.LENGTH_SHORT).show()
            }
            recyclerView.adapter?.notifyDataSetChanged()
        }

        viewModel.getHamInfo("2500")
    }
}
