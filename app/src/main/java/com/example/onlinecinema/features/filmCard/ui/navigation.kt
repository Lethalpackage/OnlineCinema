package com.example.onlinecinema.features.filmCard.ui

import com.example.onlinecinema.features.moviesListScreen.domain.model.FilmsDomainModel
import com.github.terrakok.cicerone.androidx.FragmentScreen


fun MovieInfoScreen(movie: FilmsDomainModel) = FragmentScreen {
    FilmCardFragment.newInstance(movie)
}