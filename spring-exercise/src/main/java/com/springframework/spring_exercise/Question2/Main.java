package com.springframework.spring_exercise.Question2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(new PetrolEngine());
        car.drive();
    }
}
