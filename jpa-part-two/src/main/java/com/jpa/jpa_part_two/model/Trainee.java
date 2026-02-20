package com.jpa.jpa_part_two.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public class Trainee {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int age;
}
