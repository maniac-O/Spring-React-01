package com.velog.maniac.NaverApi.TestNaverApi;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDictionary {

    private List<item> items;

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class item {
        private String title;
        private String link;
        private String description;
        private String thumbnail;
    }
}
