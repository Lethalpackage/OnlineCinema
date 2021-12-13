package com.example.onlinecinema.features.moviesListScreen.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.onlinecinema.R
import com.example.onlinecinema.databinding.FragmentFilmsListBinding
import com.example.onlinecinema.features.moviesListScreen.ui.adapter.FilmsListAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class FilmsListFragment : Fragment(R.layout.fragment_films_list) {

    private val viewModel by viewModel<FilmsListViewModel>()
    private val viewBinding by viewBinding<FragmentFilmsListBinding>()

    private val moviesListAdapter by lazy {
        FilmsListAdapter(
            moviesList = mutableListOf(),
            onItemClicked = { movieDomainModel ->
                viewModel.processUiEvent(UiEvent.OnCinemaClicked(movieDomainModel))
            }
        )
    }

    private fun initRecyclerView() {
        viewBinding.moviesListRecycler.apply {
            adapter = moviesListAdapter
            layoutManager = LinearLayoutManager(requireContext())

        }
    }

    private fun render(viewState: ViewState) {
        if (viewState.errorMessage != null) return
        moviesListAdapter.setMovieList(viewState.moviesList)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView()
        viewModel.viewState.observe(viewLifecycleOwner, ::render)
    }
}



