package com.jpa.jpa_part_two.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Salary {

    private double basicSalary;
    private double bonusSalary;
    private double taxAmount;
    private double specialAllowanceSalary;
}

