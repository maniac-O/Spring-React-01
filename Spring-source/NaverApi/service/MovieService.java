package com.velog.maniac.NaverApi.service;

import java.util.List;

import com.velog.maniac.NaverApi.handler.ClientNoContentRuntimeException;
import com.velog.maniac.NaverApi.model.Movie;
import com.velog.maniac.NaverApi.repository.MovieRepository;

import org.springframework.stereotype.Service;

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

    public Movie recommendTodayMovie() {
        var query = "테스트쿼리 검색결과없음";

        MovieGroup movieGroup = new MovieGroup(movieRepository.findByQuery(query));

        return movieGroup.getHighestRatingMovie().orElseThrow(ClientNoContentRuntimeException::new);
    }
}