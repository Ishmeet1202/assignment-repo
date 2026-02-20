package com.jpa.jpa_part_two.controller;

import com.jpa.jpa_part_two.model.Worker;
import com.jpa.jpa_part_two.service.ComponentMappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cm")
public class ComponentMappingController {
    @Autowired
    ComponentMappingService service;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Worker m)
    {
        service.create(m);
        return ResponseEntity.ok("Done");
    }
    @GetMapping("/all")
    public ResponseEntity<?> get()
    {
        return ResponseEntity.ok(service.getALL());
    }
}
