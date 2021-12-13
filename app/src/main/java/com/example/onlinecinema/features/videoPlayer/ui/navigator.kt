package com.example.onlinecinema.features.videoPlayer.ui

import com.github.terrakok.cicerone.androidx.FragmentScreen

fun PlayerFragment(url: String) = FragmentScreen {
    PlayerFragment.newInstance(url)
}