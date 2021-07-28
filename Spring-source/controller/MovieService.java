package com.velog.maniac.controller;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    // 의존성 주입 (DI)
    private final MovieRepository movieRepository;

    // @Autowired
    // private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> search(final String query) {
        System.out.println("MovieService.java");
        MovieGroup movieGroup = new MovieGroup(movieRepository.findByQuery(query));
        return movieGroup.getListOrderRating();
    }
}