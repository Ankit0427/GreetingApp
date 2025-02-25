package com.example.GreetingApp.Service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String greeting() {
        return "Hello World";
    }

}
