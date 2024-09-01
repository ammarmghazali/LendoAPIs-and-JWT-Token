package com.library.lendoapis.service.Impl;

import com.library.lendoapis.Constants.EndpointConstant;
import com.library.lendoapis.service.BaseService;
import com.library.lendoapis.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static com.library.lendoapis.Constants.EndpointConstant.*;

@Service
@RequiredArgsConstructor
public class PostServiceImpl extends BaseService implements PostService {

    private final RestTemplate restTemplate;


    @Override
    public String getPost() {
        String endpoint = EndpointConstant.BASE_URL + EndpointConstant.POSTS;
        HttpHeaders headers = getHttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<String> response = restTemplate.exchange(endpoint, HttpMethod.GET, entity, String.class);
        return response.getBody();
    }

    @Override
    public String getPostComments(Long postId) {
        String endpoint = EndpointConstant.BASE_URL + PUBLIC_V2_POSTS + postId + COMMENT;
        HttpHeaders headers = getHttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<String> response = restTemplate.exchange(endpoint, HttpMethod.GET, entity, String.class);
        return response.getBody();
    }
}
