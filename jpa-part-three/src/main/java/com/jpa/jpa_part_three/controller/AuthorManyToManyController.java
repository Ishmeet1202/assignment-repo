package com.jpa.jpa_part_three.controller;

import com.jpa.jpa_part_three.Model.Author3;
import com.jpa.jpa_part_three.Service.AuthorManyToMany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/a3")
public class AuthorManyToManyController {
    @Autowired
    AuthorManyToMany service;

    @GetMapping("/all")
    public ResponseEntity<?> all()
    {
        return ResponseEntity.ok(service.getAll());
    }
    @PostMapping("/create")
    public Author3 save(@RequestBody Author3 a){
        return service.save(a);
    }
}
