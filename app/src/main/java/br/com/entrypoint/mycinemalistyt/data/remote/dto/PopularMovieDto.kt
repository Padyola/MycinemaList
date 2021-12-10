package br.com.entrypoint.mycinemalistyt.data.remote.dto

import br.com.entrypoint.mycinemalistyt.domain.PopularMovie
import com.google.gson.annotations.SerializedName

data class PopularMovieDto(

    val id: Long,
    val tittle: String,
    val overview: String,
    @SerializedName("release_date")
    val releaseDate: String,
    @SerializedName("vote_average")
    val voteAverage: Double

) {
    fun toPopularMovie() : PopularMovie {
        return PopularMovie(
            id = id,
            tittle = tittle,
            description = overview,
            voteAverage = voteAverage
        )
    }
}

