package com.velog.maniac.NaverApi.repository;

import java.util.List;
import java.util.stream.Collectors;

import com.velog.maniac.NaverApi.config.NaverProperties;
import com.velog.maniac.NaverApi.model.Movie;
import com.velog.maniac.NaverApi.model.ResponseMovie;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MovieRepositoryImpl implements MovieRepository {

    private final RestTemplate restTemplate;
    private final NaverProperties naverProperties;

    public MovieRepositoryImpl(RestTemplate restTemplate, NaverProperties naverProperties) {
        this.restTemplate = restTemplate;
        this.naverProperties = naverProperties;
    }

    public List<Movie> findByQuery(final String query) {

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("X-Naver-Client-Id", naverProperties.getClientId());
        httpHeaders.add("X-Naver-Client-Secret", naverProperties.getClientSecret());

        String url = naverProperties.getMovieUrl() + "?query=" + query;

        ResponseMovie response = restTemplate
                .exchange(url, HttpMethod.GET, new HttpEntity(httpHeaders), ResponseMovie.class).getBody();

        List<Movie> responseItems = response
                .getItems().stream().map(m -> Movie.builder().title(m.getTitle()).link(m.getLink())
                        .userRating(m.getUserRating()).lastBuildDate(response.getLastBuildDate()).build())
                .collect(Collectors.toList());

        return responseItems;

    }
}