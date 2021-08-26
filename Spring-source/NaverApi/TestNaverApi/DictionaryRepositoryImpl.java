package com.velog.maniac.NaverApi.TestNaverApi;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DictionaryRepositoryImpl implements DictionaryRepository {

    private final RestTemplate restTemplate;
    private final NaverProperties2 naverProperties2;

    public DictionaryRepositoryImpl(RestTemplate restTemplate, NaverProperties2 naverProperties2) {
        this.restTemplate = restTemplate;
        this.naverProperties2 = naverProperties2;
    }

    @Override
    public List<Dictionary> findByQuery(final String query) {

        System.out.println("Impl");

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("X-Naver-Client-Id", naverProperties2.getClientId());
        httpHeaders.add("X-Naver-Client-Secret", naverProperties2.getClientSecret());

        String url = naverProperties2.getDictionaryUrl() + "?query=" + query;
        System.out.println("url : " + url);

        return restTemplate.exchange(url, HttpMethod.GET, new HttpEntity(httpHeaders), ResponseDictionary.class)
                .getBody().getItems().stream().map(m -> Dictionary.builder().title(m.getTitle()).link(m.getLink())
                        .description(m.getDescription()).thumbnail(m.getThumbnail()).build())
                .collect(Collectors.toList());
    }
}
