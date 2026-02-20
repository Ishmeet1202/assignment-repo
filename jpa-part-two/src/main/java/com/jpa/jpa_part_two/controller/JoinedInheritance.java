package com.jpa.jpa_part_two.controller;

import com.jpa.jpa_part_two.model.*;
import com.jpa.jpa_part_two.model.JVM2;
import com.jpa.jpa_part_two.model.QA2;
import com.jpa.jpa_part_two.model.Trainee2;
import com.jpa.jpa_part_two.service.JoinedInheritanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/joined")
public class JoinedInheritance
{
    @Autowired
    JoinedInheritanceService service;
    @PostMapping("/jvm")
    void CreateJVM(@RequestBody JVM2 j)
    {
        service.createJVM(j);
    }
    @PostMapping("/qa")
    void CreateQA(@RequestBody QA2 j)
    {
        service.createQA(j);
    }
    @GetMapping("/get")
    List<Trainee2> get()
    {
        return service.get();
    }
}
