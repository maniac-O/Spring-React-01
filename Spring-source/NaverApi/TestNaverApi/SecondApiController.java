package com.velog.maniac.NaverApi.TestNaverApi;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondApiController {

    // 의존성 주입 (DI)
    private final DictionaryService dictionaryService;

    public SecondApiController(DictionaryService dictionaryService) {
        this.dictionaryService = dictionaryService;
    }

    @GetMapping("/api/v1/search/movies2")
    public List<Dictionary> getDictionary(@RequestParam(name = "q") String query) {
        System.out.println("Controller");
        return dictionaryService.search(query);
    }
}
