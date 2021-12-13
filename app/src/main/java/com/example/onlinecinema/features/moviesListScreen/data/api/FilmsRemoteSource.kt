package com.example.onlinecinema.features.moviesListScreen.data.api

import com.example.onlinecinema.features.moviesListScreen.data.api.model.FilmsResultsModel

class FilmsRemoteSource(private val api: FilmsApi) {

    suspend fun getFilmsList(): FilmsResultsModel = api.getFilmsList()
}