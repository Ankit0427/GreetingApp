package com.example.GreetingApp.Controller;

import com.example.GreetingApp.Controller.GreetingApp;
import com.example.GreetingApp.Service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")

@Service
public class GreetingApp {

    @GetMapping
    public String getGreeting(){
        return "{\"message\": \"Hello World\"}";
    }

    @PostMapping
    public String postGreeting(){
        return "{\"message\": \"Greeting Received\"}";
    }

    @PutMapping
    public String putGreeting(){
        return "{\"message\": \"Greeting Updated\"}";
    }

    @DeleteMapping
    public String deleteGreeting(){
        return "{\"message\": \"Greeting Deleted\"}";
    }

    @Autowired
    private GreetingService greetingService;

    @GetMapping
    public String getGreeting(@RequestParam(required = false) String firstName,
                              @RequestParam(required = false) String lastName) {
        return "{\"message\": \"" + greetingService.getGreetingMessage(firstName, lastName) + "\"}";
    }
}
