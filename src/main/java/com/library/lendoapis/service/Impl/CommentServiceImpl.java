package com.library.lendoapis.service.Impl;

import com.library.lendoapis.Constants.EndpointConstant;
import com.library.lendoapis.service.BaseService;
import com.library.lendoapis.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Service
public class CommentServiceImpl extends BaseService implements CommentService {

    private final RestTemplate restTemplate;

    @Override
    public String getComments() {
        String endpoint = EndpointConstant.BASE_URL + EndpointConstant.COMMENTS;
        HttpHeaders headers = getHttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<String> response = restTemplate.exchange(endpoint, HttpMethod.GET, entity, String.class);
        return response.getBody();
    }
}
