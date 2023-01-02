package com.demo.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.demo.entities.Movie;

@Repository
public class DummyDb {
    private Map<Integer, Movie> moviesDb;
    private static int dbId = 0;

    public DummyDb() {
        System.out.println("In DummyDb constructor");
        moviesDb = new HashMap<Integer, Movie>();

        moviesDb.put(++dbId, new Movie(dbId, "Superman is in air", "Clark", 4.9));
        moviesDb.put(++dbId, new Movie(dbId, "Ironman in new avatar", "Tony", 4.8));
    }

    public List<Movie> findAllMovies() {
        List<Movie> moviesList = new ArrayList<Movie>(moviesDb.values());
        return moviesList;
    }

    public Movie findMovieById(int id) {
        return moviesDb.get(id);
    }

    public Movie saveMovie(Movie movie) {
        movie.setId(++dbId);
        moviesDb.put(dbId, movie);
        return movie;
    }

}
