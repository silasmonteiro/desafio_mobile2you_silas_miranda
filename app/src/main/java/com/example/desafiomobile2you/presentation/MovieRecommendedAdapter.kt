package com.example.desafiomobile2you.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.desafiomobile2you.R
import com.example.desafiomobile2you.domain.model.Movie
import kotlinx.android.synthetic.main.item_recommended_movies.view.*

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
            tv_categoriaFilme.text = movie.releaseData.year.toString()
            tv_anofilme.text = movie.releaseData.year.toString()

        }
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}