package com.example.onlinecinema.features.moviesListScreen.data.api.model

import com.google.gson.annotations.SerializedName

class FilmsModel (
    @SerializedName("adult")
    val adult: Boolean,
    @SerializedName("genres")
    val genres: List<GenresModel>,
    @SerializedName("id")
    val id: Int,
    @SerializedName("original_language")
    val originalLanguage: String,
    @SerializedName("original_title")
    val originalTitle: String,
    @SerializedName("overview")
    val overview: String,
    @SerializedName("release_date")
    val releaseDate: String,
    @SerializedName("poster_path")
    val posterPath: String,
    @SerializedName("popularity")
    val popularity: Double,
    @SerializedName("title")
    val title: String,
    @SerializedName("video")
    val video: String,
    @SerializedName("vote_average")
    val voteAverage: Double,
    @SerializedName("vote_count")
    val voteCount: String,
)




/*
"id": 244786,
"original_language": "en",
"original_title": "Whiplash",
"overview": "Under the direction of a ruthless instructor, a talented young drummer begins to pursue perfection at any cost, even his humanity.",
"release_date": "2014-10-10",
"poster_path": "https://upload.wikimedia.org/wikipedia/en/0/01/Whiplash_poster.jpg",
"popularity": 8.441533,
"title": "Whiplash",
"video": "http://techslides.com/demos/sample-videos/small.mp4",
"vote_average": 8.5,
"vote_count": 856*/
