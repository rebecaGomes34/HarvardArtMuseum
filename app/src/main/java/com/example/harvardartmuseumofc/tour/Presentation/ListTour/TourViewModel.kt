package com.example.harvardartmuseumofc.tour.Presentation.ListTour

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.harvardartmuseumofc.tour.Domain.GetHamUseCase
import com.example.harvardartmuseumofc.tour.Domain.TourInfo
import kotlinx.coroutines.launch

class TourViewModel(
    val getHamInfoUseCase: GetHamUseCase
) : ViewModel() {

    val hamInfoLiveData = MutableLiveData<List<TourInfo>>()

    fun getHamInfo(roomNumber: String) {
        viewModelScope.launch {
            try {
                val hamInfo = getHamInfoUseCase(roomNumber)
                hamInfoLiveData.value = hamInfo
            } catch (error: Exception){
                error.toString()
            }
        }
    }

    class Factory(val getHamInfoUseCase: GetHamUseCase) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(TourViewModel::class.java)) {
                return TourViewModel(getHamInfoUseCase) as T
            }
            throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
}
