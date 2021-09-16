package com.example.desafiomobile2you.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.desafiomobile2you.R
import com.example.desafiomobile2you.domain.model.Movie
import com.example.desafiomobile2you.domain.model.ToGenres
import com.example.desafiomobile2you.util.extension.createImagePath
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_recommended_movies.view.*
import java.util.*

class MovieRecommendedAdapter(private val movies:List<Movie>) : RecyclerView.Adapter<
        MovieRecommendedAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(
                R.layout.item_recommended_movies,
                parent,
                false
            )
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        var movie = movies[position]
        with(holder.itemView){
            tv_tituloFilme.text = movie.title
            tv_ano_genre.text = getGenre(movie)
            Picasso.get().load(movie.posterPath.createImagePath()).into(iv_filme1)
        }
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    private fun getGenre(movie: Movie) : String {
        val genreIds = movie.genreIds
        val year = movie.releaseData.subSequence(0, 4)
        var genres = ""
        genreIds.forEach {
            genres += "${ToGenres.invoke(it)}, "
        }
        return "$year ${genres.subSequence(0, genres.count() - 2)}"
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}