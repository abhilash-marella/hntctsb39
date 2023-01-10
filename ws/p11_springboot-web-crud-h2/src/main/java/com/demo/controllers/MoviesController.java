package com.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.Movie;
import com.demo.services.MovieService;

@RestController
@RequestMapping("/moviesapp/v1/movies")
@CrossOrigin(origins = {"https://hoppscotch.io/", "http://localhost:4200/"})
public class MoviesController {
    @Autowired
    private MovieService movieService;

    @GetMapping()
    public List<Movie> allMovies(){
        return movieService.findAllMovies();
    }
    
    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable int id){
        return movieService.findMovieById(id);
    }

    @PostMapping()
    public Movie createMovieInDatabase(@RequestBody Movie movie){
        return movieService.saveMovie(movie);
    }

}
