package com.velog.maniac.NaverApi.TestNaverApi;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Dictionary {

    private String title;
    private String link;
    private String description;
    private String thumbnail;
}
