package com.example.RestTemplateA.controller;

import com.example.RestTemplateA.model.MyString;
import com.example.RestTemplateA.service.StringService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class StringController
{
    private final StringService stringService;

    @PostMapping("/returnString")
    public String returnString(@RequestBody MyString myString)
    {
        return stringService.returnString(myString);
    }

}