package com.velog.maniac.NaverApi.repository;

import java.util.List;

import com.velog.maniac.NaverApi.model.Movie;

public interface MovieRepository {
    List<Movie> findByQuery(String query);
}