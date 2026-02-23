package com.jpa.jpa_part_three.controller;

import com.jpa.jpa_part_three.Model.Author;
import com.jpa.jpa_part_three.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorService service;

    @GetMapping("/all")
    public ResponseEntity<?> all()
    {
        return ResponseEntity.ok(service.getAll());
    }
    @PostMapping("/create")
    public Author save(@RequestBody Author a){
        return service.save(a);
    }
}