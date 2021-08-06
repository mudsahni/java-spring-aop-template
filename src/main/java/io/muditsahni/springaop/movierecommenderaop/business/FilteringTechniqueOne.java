package io.muditsahni.springaop.movierecommenderaop.business;

import io.muditsahni.springaop.movierecommenderaop.data.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilteringTechniqueOne {
    @Autowired
    private Movie movie;

    public String contentBasedFiltering() {
        return movie.getMovieDetails();
    }

}
