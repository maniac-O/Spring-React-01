package com.velog.maniac.NaverApi.handler;

import com.velog.maniac.NaverApi.model.ExceptionMessage;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "검색 결과 없음")
public class ClientNoContentRuntimeException extends RuntimeException {
    public ClientNoContentRuntimeException() {
        super(ExceptionMessage.NO_CONTENT.getMessage());
    }
}
