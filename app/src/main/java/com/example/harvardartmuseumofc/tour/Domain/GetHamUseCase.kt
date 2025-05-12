package com.example.harvardartmuseumofc.tour.Domain

class GetHamUseCase (private val repository: HamInfoRepository) {

    suspend operator fun invoke(galleryId: String): List<TourInfo> {
        return repository.getTourInfoByGallery(galleryId)
    }
}
