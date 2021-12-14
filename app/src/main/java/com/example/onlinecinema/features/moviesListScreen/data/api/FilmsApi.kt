package com.example.onlinecinema.features.moviesListScreen.data.api

import com.example.onlinecinema.features.moviesListScreen.data.api.model.FilmsResultsModel
import retrofit2.http.GET

//https://gist.githubusercontent.com/LukyanovAnatoliy/eca5141dedc79751b3d0b339649e06a3/raw/38f9419762adf27c34a3f052733b296385b6aa8d/

interface FilmsApi {
    @GET("eca5141dedc79751b3d0b339649e06a3/raw/38f9419762adf27c34a3f052733b296385b6aa8d/")
    suspend fun getFilmsList(): FilmsResultsModel

}