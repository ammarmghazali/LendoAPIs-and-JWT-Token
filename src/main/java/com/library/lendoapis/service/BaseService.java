package com.library.lendoapis.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;

public class BaseService {

    @Value("${api.access.token}")
    private String accessToken;

    protected HttpHeaders getHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + accessToken);
        return headers;
    }
}
