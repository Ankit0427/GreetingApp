package com.example.GreetingApp.reprository;


import com.example.GreetingApp.model.Greeting;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingReprository extends JpaRepository<Greeting, Long> {

    //Repository
}