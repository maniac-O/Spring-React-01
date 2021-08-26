package com.velog.maniac.NaverApi.TestNaverApi;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DictionaryService implements Serializable {

    // 의존성 주입 (DI)
    private final DictionaryRepository dictionaryRepository;

    public DictionaryService(DictionaryRepository dictionaryRepository) {
        this.dictionaryRepository = dictionaryRepository;
    }

    public List<Dictionary> search(final String query) {
        System.out.println("Service");
        return dictionaryRepository.findByQuery(query);
    }
}
