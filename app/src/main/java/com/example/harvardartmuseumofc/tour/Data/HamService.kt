package com.example.harvardartmuseumofc.tour.Data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import retrofit2.http.GET
import retrofit2.http.Query

interface HamService {

    @GET("object")
    suspend fun getArtByGallery(

        @Query("gallery") gallery: String,
        @Query("apikey") apiKey: String = "72bb9540-dd48-11e8-a147-6bd212908941"
    ): ArtResponse
}

    @Serializable
    data class ArtResponse(
    @SerialName("records") val records: List<ArtRecord>)
