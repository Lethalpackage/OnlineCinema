package com.example.onlinecinema.features.filmCard.ui

import android.os.Bundle
import android.view.KeyCharacterMap.load
import android.view.PointerIcon.load

import android.view.View
import androidx.core.os.bundleOf

import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bumptech.glide.Glide
import com.example.onlinecinema.R
import com.example.onlinecinema.databinding.FragmentFilmCardBinding
import com.example.onlinecinema.features.moviesListScreen.domain.model.FilmsDomainModel

import org.koin.androidx.viewmodel.ext.android.viewModel




class FilmCardFragment(): Fragment(R.layout.fragment_film_card) {

    companion object {

        private const val AP_KEY = "movieInfo"

        fun newInstance(movie: FilmsDomainModel): FilmCardFragment {
            return FilmCardFragment().apply {
                arguments = bundleOf(AP_KEY to movie)
            }
        }
    }

    private val viewModel by viewModel<FilmCardViewModel>()
    private val binding by viewBinding<FragmentFilmCardBinding>()

    private val movie: FilmsDomainModel by lazy {
        requireArguments().getParcelable(AP_KEY)!!
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            tvMovieTitle.text = movie.title
            tvMovieOverview.text = movie.overview
            tvMovieReleaseDate.text = movie.releaseDate
            bWatchMovie.setOnClickListener {
                viewModel.processUiEvent(UiEvent.OnPlayClicked(movie.video))
            }
        }
    }
}
