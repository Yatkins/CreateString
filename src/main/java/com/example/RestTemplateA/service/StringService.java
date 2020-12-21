package com.example.RestTemplateA.service;

import com.example.RestTemplateA.model.MyString;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class StringService
{
    private final RestTemplate restTemplate;

    public String returnString(MyString myString){
        HttpEntity<MyString> httpEntity = new HttpEntity<>(myString);

        try {
            return restTemplate.exchange("http://localhost:8082/api/v1/returnString",
                    HttpMethod.POST, httpEntity, String.class).getBody();
        } catch (RestClientException e) {
            System.out.println(e.getMessage());
            return "error";
        }

    }

}