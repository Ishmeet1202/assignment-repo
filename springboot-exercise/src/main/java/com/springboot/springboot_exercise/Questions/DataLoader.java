package com.springboot.springboot_exercise.Questions;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final EmployeeRepository repo;

    public DataLoader(EmployeeRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) {

        System.out.println("Inserting employees");

        repo.save(new Employee("Ishmeet", "Backend Developer"));
        repo.save(new Employee("Rohit", "Tester"));
        repo.save(new Employee("Bharat", "DevOps"));
        repo.save(new Employee("Nitin", "HR"));

        System.out.println("All Employees:");

        repo.findAll().forEach(e ->
                System.out.println(e)
        );
    }
}
