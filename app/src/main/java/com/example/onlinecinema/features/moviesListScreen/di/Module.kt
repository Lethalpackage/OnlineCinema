package com.example.onlinecinema.features.moviesListScreen.di

import com.example.onlinecinema.features.moviesListScreen.ui.FilmsListViewModel
import com.example.onlinecinema.features.moviesListScreen.data.api.FilmsApi
import com.example.onlinecinema.features.moviesListScreen.data.api.FilmsRemoteSource
import com.example.onlinecinema.features.moviesListScreen.data.api.FilmsRepo
import com.example.onlinecinema.features.moviesListScreen.data.api.FilmsRepoImpl
import com.example.onlinecinema.features.moviesListScreen.domain.FilmsListInteractor
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

val movieListModule = module {
    single<FilmsApi> {
        get<Retrofit>().create(FilmsApi::class.java)
    }

    single<FilmsRemoteSource> {
        FilmsRemoteSource(get<FilmsApi>())
    }

    single<FilmsRepo> {
       FilmsRepoImpl(source = get())
    }

    single<FilmsListInteractor> {
        FilmsListInteractor(get<FilmsRepo>())
    }

    viewModel<FilmsListViewModel>{
        FilmsListViewModel(get<FilmsListInteractor>(), router = get())
    }
}
