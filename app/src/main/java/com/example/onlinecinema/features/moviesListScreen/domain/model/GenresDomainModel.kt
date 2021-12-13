package com.example.onlinecinema.features.moviesListScreen.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
@Parcelize
data class GenresDomainModel(
    val name: String,
) : Parcelable