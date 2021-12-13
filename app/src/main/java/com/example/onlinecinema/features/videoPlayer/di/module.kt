package com.example.onlinecinema.features.videoPlayer.di

import com.example.onlinecinema.features.videoPlayer.clientPlayer.Player
import com.example.onlinecinema.features.videoPlayer.clientPlayer.PlayerImpl
import com.example.onlinecinema.features.videoPlayer.domain.PlayerInteractor
import com.example.onlinecinema.features.videoPlayer.ui.PlayerViewModel
import com.google.android.exoplayer2.ExoPlayer
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val playerModule = module {

    single {
        ExoPlayer.Builder(androidContext()).build()
    }

    single<Player> {
        PlayerImpl(exoPlayer = get())
    }

    single {
        PlayerInteractor(player = get())
    }

    viewModel { (url: String) ->
        PlayerViewModel(url = url, playerInteractor = get())
    }
}