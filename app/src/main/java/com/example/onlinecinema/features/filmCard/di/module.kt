package com.example.onlinecinema.features.filmCard.di

import com.example.onlinecinema.features.filmCard.ui.FilmCardViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val movieInfoModule = module {

    viewModel {
       FilmCardViewModel(router = get())
    }
}