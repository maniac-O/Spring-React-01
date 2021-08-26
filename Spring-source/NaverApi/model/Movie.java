package com.velog.maniac.NaverApi.model;

import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;
import java.sql.Timestamp;

@Builder
@Getter
public class Movie implements Serializable {

    private Timestamp lastBuildDate;
    private String title;
    private String link;
    private float userRating;

}