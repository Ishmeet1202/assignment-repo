package com.springboot.restservicespartone.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public class Employee {

    private Integer id;

    @Size(min = 2, message = "Employee name must have atleast two characters.")
    private String name;

    @Min(value = 18, message = "Employee must have a age of 18.")
    @PositiveOrZero(message = "Age cannot be negative or zero.")
    private int age;

    public Employee(Integer id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
