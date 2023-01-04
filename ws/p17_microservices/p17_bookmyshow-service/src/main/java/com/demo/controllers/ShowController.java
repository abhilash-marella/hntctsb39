package com.demo.controllers;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.models.Show;
import com.demo.restclients.MovieClient;

@RestController
@RequestMapping("/cinema/shows")
public class ShowController {

    @Autowired
    private MovieClient movieClient;
    
    @GetMapping()
    public List<Show> getShows(){
        return List.of(
            new Show(LocalDateTime.of(2023, 1, 5, 21, 25, 0), "eve park", "spiderwoman", "Clark", 4.1),
            new Show(LocalDateTime.of(2023, 1, 5, 15, 53, 0), "eve park", "spiderwoman", "Clark", 4.1),
            new Show(LocalDateTime.of(2023, 1, 4, 21, 25, 0), "Dark building", "Superwoman", "Tony", 4.4)
        );
    } 


    @GetMapping("/movies")
    // from database -> movie service
    public List<Show> getMovies(){
        System.out.println("Finding movies from movieservice");
        // send rest request to movie service 

        // RestTemplate rt = new RestTemplate();
        // return rt.exchange(
        //     "http://localhost:8989/app", 
        //     HttpMethod.GET, 
        //     null, 
        //     new ParameterizedTypeReference<List<Show>>() {}
        // ).getBody();
;

        return movieClient.getMovies();
    } 

}
