package com.example.onlinecinema.features.videoPlayer.ui

import com.example.onlinecinema.base.Event
import com.google.android.exoplayer2.ui.StyledPlayerView

object ViewState

sealed class UiEvent : Event {

    data class SetPlayerView(val view: StyledPlayerView) : UiEvent()
    object PlayVideo : UiEvent()
    object PauseVide : UiEvent()
    object StopVideo : UiEvent()

}