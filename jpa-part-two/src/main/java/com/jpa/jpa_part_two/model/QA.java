package com.jpa.jpa_part_two.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
@DiscriminatorValue("QA")
public class QA extends Trainee {
    private double salary;
    private int totalTest;
}
