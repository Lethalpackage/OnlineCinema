package com.example.onlinecinema.features.moviesListScreen.data.api.model

import com.google.gson.annotations.SerializedName

class FilmsResultsModel(
    @SerializedName("page")
    val page: Int,

    @SerializedName("results")
    val results: List<FilmsModel>,

    @SerializedName("total_pages")
    val totalPages: Int,

    @SerializedName("total_results")
    val totalResults: Int,
)