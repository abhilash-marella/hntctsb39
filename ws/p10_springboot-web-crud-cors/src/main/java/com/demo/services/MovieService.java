package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.db.DummyDb;
import com.demo.entities.Movie;

@Service
public class MovieService {
    
    @Autowired
    private DummyDb dummyDatabase;

    public List<Movie> findAllMovies() {
        // last updated properties
        return dummyDatabase.findAllMovies();
    }

    public Movie findMovieById(int id) {
        // can not be negative
        return dummyDatabase.findMovieById(id);
    }

    public Movie saveMovie(Movie movie) {
        // movie should contain title, ....
        return dummyDatabase.saveMovie(movie);
    }
}
