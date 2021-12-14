package com.example.onlinecinema.features.moviesListScreen.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.onlinecinema.R
import com.example.onlinecinema.features.moviesListScreen.domain.model.FilmsDomainModel

class FilmsListAdapter(
    private val moviesList: MutableList<FilmsDomainModel>,
    private val onItemClicked: (item: FilmsDomainModel) -> Unit
) : RecyclerView.Adapter<FilmsListAdapter.MoviesListViewHolder>() {

    class MoviesListViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var layoutMovie: ConstraintLayout = view.findViewById(R.id.layoutMovie)
        var tvTitle: TextView = view.findViewById(R.id.tvTitle)
        var tvOverview: TextView = view.findViewById(R.id.tvOverview)
        var ivPreview: ImageView = view.findViewById(R.id.moviePoster)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesListViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_films, parent, false)
        return MoviesListViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MoviesListViewHolder, position: Int) {
        with(holder) {
            tvTitle.text = moviesList[position].title
            tvOverview.text = moviesList[position].overview
            Glide
                .with(holder.itemView)
                .load(moviesList[position].posterPath)
                .centerCrop()
                .into(ivPreview)

            layoutMovie.setOnClickListener {
                onItemClicked(moviesList[position])
            }
        }
    }

    override fun getItemCount(): Int = moviesList.size

    @SuppressLint("NotifyDataSetChanged")
    fun setMovieList(list: List<FilmsDomainModel>) {
        this.moviesList.clear()
        this.moviesList.addAll(list)
        notifyDataSetChanged()
    }
}