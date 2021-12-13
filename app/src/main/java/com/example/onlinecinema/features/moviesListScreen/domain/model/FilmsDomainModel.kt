package com.example.onlinecinema.features.moviesListScreen.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class FilmsDomainModel (
    val genres: List<GenresDomainModel>,
    val adult: Boolean,
    val id: Int,
    val originalLanguage: String,
    val originalTitle: String,
    val overview: String,
    val releaseDate: String,
    val posterPath: String,
    val popularity: Double,
    val title: String,
    val video: String,
    val voteAverage: Double,
    val voteCount: String,
        ):Parcelable
