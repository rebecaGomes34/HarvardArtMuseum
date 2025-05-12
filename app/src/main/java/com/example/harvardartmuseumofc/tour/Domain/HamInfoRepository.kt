package com.example.harvardartmuseumofc.tour.Domain

interface HamInfoRepository {
    suspend fun getTourInfoByGallery(galleryId: String): List<TourInfo>
}