package com.example.harvardartmuseumofc.tour.Data

import com.example.harvardartmuseumofc.tour.Domain.HamInfoRepository
import com.example.harvardartmuseumofc.tour.Domain.TourInfo

class HamInfoRepositoryImpl(
    private val service: HamService
) : HamInfoRepository {

    override suspend fun getTourInfoByGallery(galleryId: String): List<TourInfo> {
        val response = service.getArtByGallery(galleryId)

        return response.records.map { record ->
            TourInfo(
                title = record.title ?: "Sem Título",
                imageurl = record.images?.firstOrNull()?.baseImageUrl.orEmpty(),
                author = record.people?.firstOrNull()?.name ?: "Autor Desconhecido",
                description = record.description ?: "Sem descrição disponível."
            )
        }
    }
}