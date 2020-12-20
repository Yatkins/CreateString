package com.example.RestTemplateA.service;

import com.example.model.MyString;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StringService
{

    public String returnString(MyString myString){
        return myString.getString() + " is the String";
    }

}