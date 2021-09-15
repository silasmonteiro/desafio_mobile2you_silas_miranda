package com.example.desafiomobile2you.domain.model

import com.google.gson.annotations.SerializedName
import java.util.*

class Movie(

    val id: Int,

    @SerializedName("vote_count")
    val voteCount: Int?,

    @SerializedName("original_title")
    val title: String?,

    val popularity: Double?,

    @SerializedName("release_date")
    val releaseData: Date
)