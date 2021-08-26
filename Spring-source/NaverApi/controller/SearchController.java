package com.velog.maniac.NaverApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.velog.maniac.NaverApi.model.Movie;
import com.velog.maniac.NaverApi.service.MovieService;

@RestController
@RequestMapping("/api/v1/search")
public class SearchController {

    private final MovieService movieService;

    public SearchController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public List<Movie> getMoviesByQuery(@RequestParam(name = "q") String query) {
        System.out.println("SearchController.java");
        return movieService.search(query);
    }

    @GetMapping("/movies/recommend")
    public Movie getRecommendMoviesByQuery() {
        return movieService.recommendTodayMovie();
    }
}