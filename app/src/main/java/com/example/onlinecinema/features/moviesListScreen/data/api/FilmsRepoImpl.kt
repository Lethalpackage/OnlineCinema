package com.example.onlinecinema.features.moviesListScreen.data.api

import com.example.onlinecinema.features.moviesListScreen.data.toDomain
import com.example.onlinecinema.features.moviesListScreen.domain.model.CinemaDomainModel

class FilmsRepoImpl(private var source: FilmsRemoteSource): FilmsRepo {

    override suspend fun getFilmsList(): CinemaDomainModel {
       return source.getFilmsList().toDomain()
    }


}