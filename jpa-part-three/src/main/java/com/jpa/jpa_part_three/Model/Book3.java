package com.jpa.jpa_part_three.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Book3 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bookName;
    @ManyToMany(mappedBy = "books")
    @JsonIgnore
    private List<Author3> authors;
}
