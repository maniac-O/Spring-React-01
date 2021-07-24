package com.velog.maniac.controller;

import java.util.List;

public interface MovieRepository {
    List<Movie> findByQuery(String query);
}