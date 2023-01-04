package com.demo.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

// import com.demo.db.DummyDb;
import com.demo.entities.Movie;
import com.demo.repositories.MovieRepository;

@Service
public class MovieService {
    
    @Autowired
    // private DummyDb dummyDatabase;
    private MovieRepository repo;

    public List<Movie> findAllMovies() {
        return repo.findAll();
    }


    @Cacheable(value="mymoviecache", key="#id")
    public Movie findMovieById(int id) {

        System.out.println("MovieService:findMovieById #"+id+" => "+LocalDateTime.now());

        Optional<Movie> optional = repo.findById(id);
        if(optional.isEmpty()){
            throw new RuntimeException("Movie with #id as "+id+" not found in db");
        } else {   
            return optional.get();
        }
    }

    public Movie saveMovie(Movie movie) {
        return repo.save(movie);
    }


    @CachePut(value="mymoviecache", key="#id")
    public Movie updateMovieById(int id, @RequestBody Movie movie) {

        System.out.println("MovieService:updateMovieById #"+id+" => "+LocalDateTime.now());

        return null;
    }

    
    @CacheEvict(value="mymoviecache", key="#id")
    public Movie deleteMovieById(int id) {
        System.out.println("MovieService:deleteMovieById #"+id+" => "+LocalDateTime.now());

        return null;
    }

    

}
