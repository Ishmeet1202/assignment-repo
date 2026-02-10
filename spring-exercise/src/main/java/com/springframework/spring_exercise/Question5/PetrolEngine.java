package com.springframework.spring_exercise.Question5;

import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Car petrol engine started");
    }
}
