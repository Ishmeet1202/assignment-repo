package com.jpa.jpa_part_three.Model;


import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Address {
    private String streetNumber;
    private String location;
    private String state;
}
