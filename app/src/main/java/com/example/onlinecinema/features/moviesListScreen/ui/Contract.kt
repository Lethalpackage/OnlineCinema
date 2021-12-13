
package com.example.onlinecinema.features.moviesListScreen.ui

import androidx.annotation.StringRes

import com.example.onlinecinema.base.Event
import com.example.onlinecinema.features.moviesListScreen.domain.model.CinemaDomainModel
import com.example.onlinecinema.features.moviesListScreen.domain.model.FilmsDomainModel

data class ViewState(
    val moviesList: List<FilmsDomainModel>,
    @StringRes val errorMessage: Int?
)

sealed class UiEvent : Event {
    object RequestCinema : UiEvent()
    data class OnCinemaClicked(
        val movie: FilmsDomainModel
    ) : UiEvent()
}

sealed class DataEvent : Event {

    data class SuccessCinemaRequest(
        val cinemaDomainModel: CinemaDomainModel
    ) : DataEvent()

    data class ErrorCinemaRequest(
        val throwable: Throwable
    ) : DataEvent()
}