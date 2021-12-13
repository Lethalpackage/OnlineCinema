package com.example.onlinecinema.features.filmCard.ui

import com.example.onlinecinema.base.Event


object ViewState

sealed class UiEvent : Event {
    data class OnPlayClicked(val ulr: String) : UiEvent()
}