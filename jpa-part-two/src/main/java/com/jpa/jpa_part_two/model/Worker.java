package com.jpa.jpa_part_two.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private int age;

    @Embedded
    private Salary salary;
}
