package com.example.tv1

object MovieList {

    val MOVIE_CATEGORY = arrayOf(
        "Category Zero",
        "Category One",
        "Category Two",
        "Category Three",
        "Category Four",
        "Category Five"
    )

    val list: List<Movie> by lazy {
        setupMovies()
    }

    private var count: Long = 0

    private fun setupMovies(): List<Movie> {

        val title = arrayOf(
            "Mountain View",
            "Nature",
            "Landscape",
            "Forest",
            "Lake"
        )

        val description =
            "Demo application for Android TV using public images."

        val studio = arrayOf(
            "Studio Zero",
            "Studio One",
            "Studio Two",
            "Studio Three",
            "Studio Four"
        )

        val videoUrl = arrayOf(
            "https://storage.googleapis.com/exoplayer-test-media-0/BigBuckBunny_320x180.mp4",
            "https://storage.googleapis.com/exoplayer-test-media-0/BigBuckBunny_320x180.mp4",
            "https://storage.googleapis.com/exoplayer-test-media-0/BigBuckBunny_320x180.mp4",
            "https://storage.googleapis.com/exoplayer-test-media-0/BigBuckBunny_320x180.mp4",
            "https://storage.googleapis.com/exoplayer-test-media-0/BigBuckBunny_320x180.mp4"
        )

        val bgImageUrl = arrayOf(
            "https://upload.wikimedia.org/wikipedia/commons/3/3f/Fronalpstock_big.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/6/6e/Golde33443.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/a/a9/Example.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/5/50/Vd-Orig.png",
            "https://upload.wikimedia.org/wikipedia/commons/3/3f/Fronalpstock_big.jpg"
        )

        val cardImageUrl = arrayOf(
            "https://upload.wikimedia.org/wikipedia/commons/a/a9/Example.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/5/50/Vd-Orig.png",
            "https://upload.wikimedia.org/wikipedia/commons/6/6e/Golde33443.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/3/3f/Fronalpstock_big.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/a/a9/Example.jpg"
        )

        return title.indices.map {
            buildMovieInfo(
                title[it],
                description,
                studio[it],
                videoUrl[it],
                cardImageUrl[it],
                bgImageUrl[it]
            )
        }
    }

    private fun buildMovieInfo(
        title: String,
        description: String,
        studio: String,
        videoUrl: String,
        cardImageUrl: String,
        backgroundImageUrl: String
    ): Movie {

        val movie = Movie()

        movie.id = count++
        movie.title = title
        movie.description = description
        movie.studio = studio
        movie.videoUrl = videoUrl
        movie.cardImageUrl = cardImageUrl
        movie.backgroundImageUrl = backgroundImageUrl

        return movie
    }
}