package com.example.onlinecinema.features.moviesListScreen.ui

import com.example.onlinecinema.base.BaseViewModel
import com.example.onlinecinema.base.Event
import com.example.onlinecinema.features.filmCard.ui.MovieInfoScreen
import com.example.onlinecinema.features.moviesListScreen.domain.FilmsListInteractor
import com.github.terrakok.cicerone.Router


class FilmsListViewModel(private val interactor: FilmsListInteractor, private val router: Router) :
    BaseViewModel<ViewState>() {
    init {
        processUiEvent(UiEvent.RequestCinema)

    }

    override fun initialViewState() =
        ViewState(
            moviesList = emptyList(),
            errorMessage = null
        )

    override suspend fun reduce(event: Event, previousState: ViewState): ViewState? {

        when (event) {

            is UiEvent.RequestCinema -> {
                interactor.getFilmsList().fold(
                    onSuccess = { cinemaDomainModel ->
                        processDataEvent(
                            DataEvent.SuccessCinemaRequest(
                                cinemaDomainModel = cinemaDomainModel
                            )
                        )
                    },
                    onError = { throwable ->
                        processDataEvent(
                            DataEvent.ErrorCinemaRequest(
                                throwable = throwable
                            )
                        )
                    }
                )
            }

            is DataEvent.SuccessCinemaRequest -> {
                return previousState.copy(
                    moviesList = event.cinemaDomainModel.results,
                    errorMessage = null
                )
            }

            is DataEvent.ErrorCinemaRequest -> {
                return previousState.copy(
                    errorMessage = interactor.getErrorMessage(event.throwable)
                )
            }

            is UiEvent.OnCinemaClicked -> {
                router.navigateTo(MovieInfoScreen(event.movie))
            }
        }

        return null
    }
}