package com.jpa.jpa_part_three.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Author2 {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int age;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Book2> books;

}

