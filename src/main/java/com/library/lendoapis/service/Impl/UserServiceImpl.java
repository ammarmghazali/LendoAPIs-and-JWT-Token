package com.library.lendoapis.service.Impl;

import com.library.lendoapis.Constants.EndpointConstant;
import com.library.lendoapis.service.BaseService;
import com.library.lendoapis.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static com.library.lendoapis.Constants.EndpointConstant.POST;
import static com.library.lendoapis.Constants.EndpointConstant.PUBLIC_V2_USERS;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl extends BaseService implements UserService {


    private final RestTemplate restTemplate;

    @Override
    public String getUsers() {
        String endpoint = EndpointConstant.BASE_URL + EndpointConstant.USERS;
        HttpHeaders headers = getHttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<String> response = restTemplate.exchange(endpoint, HttpMethod.GET, entity, String.class);
        return response.getBody();
    }

    @Override
    public String getUserPosts(Long userId) {
        String endpoint = EndpointConstant.BASE_URL + PUBLIC_V2_USERS + userId + POST;
        HttpHeaders headers = getHttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<String> response = restTemplate.exchange(endpoint, HttpMethod.GET, entity, String.class);
        return response.getBody();
    }


}
