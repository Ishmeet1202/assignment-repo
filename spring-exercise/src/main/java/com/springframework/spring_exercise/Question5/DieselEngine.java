package com.springframework.spring_exercise.Question5;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class DieselEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Car Diesel engine started.");
    }
}
