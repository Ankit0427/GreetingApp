package com.example.GreetingApp.Controller;

import com.example.GreetingApp.Controller.GreetingApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")


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

}
