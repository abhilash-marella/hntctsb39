package com.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// import com.demo.db.DummyDb;
import com.demo.entities.Movie;
import com.demo.exceptions.MovieException;
import com.demo.repositories.MovieRepository;

@Service
public class MovieService {
    
    @Autowired
    // private DummyDb dummyDatabase;
    private MovieRepository repo;

    public List<Movie> findAllMovies() {
        // last updated properties
        // return dummyDatabase.findAllMovies();
        return repo.findAll();
    }

    public Movie findMovieById(int id) throws MovieException {
        // can not be negative
        // return dummyDatabase.findMovieById(id);
        Optional<Movie> optional = repo.findById(id);
        if(optional.isEmpty()){
            throw new MovieException("Movie with #id as "+id+" not found in db");
        } else {   
            return optional.get();
        }
    }

    public Movie saveMovie(Movie movie) {
        // movie should contain title, ....
        // return dummyDatabase.saveMovie(movie);
        return repo.save(movie);
    }
    
    
    public Movie removeMovieById(int id) throws MovieException {
    	if(repo.existsById(id)) {
    		Movie m = findMovieById(id);
    		repo.deleteById(id);
    		return m;
    	} else {
    		throw new MovieException("Movie with #id as "+id+" not deleted");
    	}

    }


}
