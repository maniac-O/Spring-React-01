package com.velog.maniac.controller;

import java.util.List;
import java.util.stream.Collectors;

public class MovieGroup {
    private final List<Movie> list;

    public MovieGroup(final List<Movie> list) {
        this.list = list;
    }

    public List<Movie> getList() {
        return this.list;
    }

    public List<Movie> getListOrderRating() {
        System.out.println("MovieGroup.java");
        return list.stream().filter(b -> !((Float) b.getUserRating()).equals(0.0f))
                .sorted((a, b) -> b.getUserRating() > a.getUserRating() ? 1 : -1).collect(Collectors.toList());
    }
}
