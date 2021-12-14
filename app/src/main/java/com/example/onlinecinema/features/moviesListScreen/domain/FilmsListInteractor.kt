package com.example.onlinecinema.features.moviesListScreen.domain

import com.example.onlinecinema.R
import com.example.onlinecinema.base.attempt
import com.example.onlinecinema.features.moviesListScreen.data.api.FilmsRepo
import java.net.SocketTimeoutException
import java.net.UnknownHostException


class FilmsListInteractor(
    private val cinemaRepo: FilmsRepo
) {

    suspend fun getFilmsList() = attempt {
        cinemaRepo.getFilmsList()
    }

    fun getErrorMessage(throwable: Throwable): Int {

        return when (throwable) {

            is SocketTimeoutException,
            is UnknownHostException -> {
                R.string.no_internet_connection
            }

            else -> throw Exception("Не обработанное исключение!")
        }
    }
}
