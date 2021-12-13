package com.example.onlinecinema.features.moviesListScreen.domain.model

data class CinemaDomainModel(
    val page: Int,

    val results: List<FilmsDomainModel>,

    val totalPages: Int,

    val totalResults: Int,
)