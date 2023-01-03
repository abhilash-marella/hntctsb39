package com.demo.restclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.demo.models.Show;

@FeignClient(value="movies", url = "http://localhost:9002")
public interface MovieClient {
    @GetMapping("/moviesapp/v1/movies")
    public List<Show> getMovies();
}
