package com.jpa.jpa_part_two.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class JVM2 extends Trainee2 {
    private double salary;
    private int UdemyCourse;
}