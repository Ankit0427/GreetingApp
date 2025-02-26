package com.example.GreetingApp.Service;

//import org.springframework.stereotype.Service;

import com.example.GreetingApp.model.Greeting;
//import com.example.GreetingApp.Service.GreetingService;
import com.example.GreetingApp.reprository.GreetingReprository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GreetingService {

    public String greeting() {
        return "Hello World";
    }

    public String getGreetingMessage(String firstName, String lastName) {
        if (firstName != null && lastName != null) {
            return "Hello " + firstName + " " + lastName;
        } else if (firstName != null) {
            return "Hello " + firstName;
        } else if (lastName != null) {
            return "Hello " + lastName;
        }
        return "Hello World";
    }

    @Autowired
    private GreetingReprository greetingRepository;

    public Greeting saveGreeting(String message) {
        return greetingRepository.save(new Greeting(message));
    }

    public Greeting getGreetingById(Long id) {
        return greetingRepository.findById(id).orElse(null);
    }

    public Greeting updateGreeting(Long id, String newMessage) {
        Optional<Greeting> existingGreeting = greetingRepository.findById(id);
        if (existingGreeting.isPresent()) {
            Greeting greeting = existingGreeting.get();
            greeting.setMessage(newMessage);
            return greetingRepository.save(greeting);
        }
        return null;
    }

}
