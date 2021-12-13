package com.example.onlinecinema.features.moviesListScreen.data

import com.example.onlinecinema.features.moviesListScreen.data.api.model.FilmsModel
import com.example.onlinecinema.features.moviesListScreen.data.api.model.FilmsResultsModel
import com.example.onlinecinema.features.moviesListScreen.data.api.model.GenresModel
import com.example.onlinecinema.features.moviesListScreen.domain.model.CinemaDomainModel
import com.example.onlinecinema.features.moviesListScreen.domain.model.FilmsDomainModel
import com.example.onlinecinema.features.moviesListScreen.domain.model.GenresDomainModel


fun GenresModel.toDomain(): GenresDomainModel {
    return GenresDomainModel(
        name = this.name
    )
}

fun FilmsModel.toDomain(): FilmsDomainModel {
    return FilmsDomainModel(
        adult = this.adult,
        genres = this.genres.map { genresModel ->
            genresModel.toDomain()
        },
        id = this.id,
        originalLanguage = this.originalLanguage,
        originalTitle = this.originalTitle,
        overview = this.overview,
        releaseDate = this.releaseDate,
        posterPath = this.posterPath,
        popularity = this.popularity,
        title = this.title,
        video = this.video,
        voteAverage = this.voteAverage,
        voteCount = this.voteCount
    )
}

fun FilmsResultsModel.toDomain(): CinemaDomainModel {
    return CinemaDomainModel(
        page = this.page,
        results = this.results.map { movieModel ->
            movieModel.toDomain()
        },
        totalPages = this.totalPages,
        totalResults = this.totalResults
    )
}

