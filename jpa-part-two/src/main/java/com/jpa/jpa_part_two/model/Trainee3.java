package com.jpa.jpa_part_two.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Trainee3 {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int age;
}
