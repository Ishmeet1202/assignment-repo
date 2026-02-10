package com.springframework.spring_exercise.Question1;

public class Car {
    private PetrolEngine engine = new PetrolEngine();

    public void drive() {
        engine.start();
    }
}
