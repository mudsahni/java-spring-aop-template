package io.muditsahni.springaop.movierecommenderaop.data;

import org.springframework.stereotype.Repository;

@Repository
public class Movie {
    public String getMovieDetails() {
        // interacts with the movie repository
        return "movie details";
    }
}
