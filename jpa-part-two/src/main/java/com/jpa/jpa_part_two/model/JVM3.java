package com.jpa.jpa_part_two.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class JVM3 extends Trainee3 {
    private double salary;
    private int UdemyCourse;
}
