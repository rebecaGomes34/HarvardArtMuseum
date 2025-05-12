package com.example.harvardartmuseumofc.tour

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

const val BASE_URL = "https://api.harvardartmuseums.org/"
private val retroJson = Json { ignoreUnknownKeys = true }

@OptIn(ExperimentalSerializationApi::class)
val hamRetrofit = Retrofit.Builder()
    .addConverterFactory(retroJson.asConverterFactory("application/json".toMediaType()))
    .baseUrl(BASE_URL)
    .build()