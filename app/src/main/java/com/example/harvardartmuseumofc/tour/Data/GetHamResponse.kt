package com.example.harvardartmuseumofc.tour.Data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

    @Serializable
    data class ArtRecord(

    @SerialName("title") val title: String?,
    @SerialName("images") val images: List<ImageInfo>?,
    @SerialName("people") val people: List<ArtistResponse>?,
    @SerialName("description") val description: String?)

    @Serializable
    data class ImageInfo(
    @SerialName("baseimageurl") val baseImageUrl: String?)

    @Serializable
    data class ArtistResponse(
    @SerialName("name") val name: String?)



