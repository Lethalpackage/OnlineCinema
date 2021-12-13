package com.example.onlinecinema.features.filmCard.ui


import com.example.onlinecinema.base.BaseViewModel
import com.example.onlinecinema.base.Event
import com.example.onlinecinema.features.videoPlayer.ui.PlayerFragment
import com.github.terrakok.cicerone.Router


class FilmCardViewModel(
    private val router: Router
) : BaseViewModel<ViewState>() {

    override fun initialViewState(): ViewState = ViewState

    override suspend fun reduce(event: Event, previousState: ViewState): ViewState? {
        when (event) {

            is UiEvent.OnPlayClicked -> {
                router.navigateTo(PlayerFragment(event.ulr))
            }

        }
        return null
    }
}