package com.velog.maniac.NaverApi.TestNaverApi;

import java.util.List;

public interface DictionaryRepository {
    List<Dictionary> findByQuery(String query);
}
