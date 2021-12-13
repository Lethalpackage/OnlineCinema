package com.example.onlinecinema.features.moviesListScreen.data.api

import com.example.onlinecinema.features.moviesListScreen.domain.model.CinemaDomainModel


interface FilmsRepo {
    suspend fun getFilmsList(): CinemaDomainModel
}