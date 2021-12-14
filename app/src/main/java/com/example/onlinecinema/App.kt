package com.example.onlinecinema

import android.app.Application
import com.example.onlinecinema.di.appModule
import com.example.onlinecinema.di.navigationModule
import com.example.onlinecinema.features.filmCard.di.movieInfoModule
import com.example.onlinecinema.features.moviesListScreen.di.movieListModule
import com.example.onlinecinema.features.videoPlayer.di.playerModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import timber.log.Timber

class App: Application() {
    override fun onCreate() {
        super.onCreate()


        startKoin {
            androidLogger()

            androidContext(this@App)

            modules(appModule, navigationModule, movieListModule, movieInfoModule, playerModule)
        }


        Timber.plant(Timber.DebugTree())
    }
}