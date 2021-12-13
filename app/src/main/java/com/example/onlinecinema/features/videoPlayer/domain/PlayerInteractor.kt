package com.example.onlinecinema.features.videoPlayer.domain

import com.example.onlinecinema.features.videoPlayer.clientPlayer.Player
import com.google.android.exoplayer2.ui.StyledPlayerView

class PlayerInteractor (    private val player: Player
) {

    fun setView(view: StyledPlayerView) {
        player.setView(view)
    }

    fun setUrl(url: String) {
        player.setUrl(url)
    }

    fun playerPlay() {
        player.play()
    }

    fun playerPause() {
        player.pause()
    }

    fun stopPlayer() {
        player.stop()
    }
}
