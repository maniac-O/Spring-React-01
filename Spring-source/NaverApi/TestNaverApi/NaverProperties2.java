package com.velog.maniac.NaverApi.TestNaverApi;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "naver.openapi2")
public class NaverProperties2 {

    private String dictionaryUrl;
    private String clientId;
    private String clientSecret;
}
