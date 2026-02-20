package com.jpa.jpa_part_two.controller;

import com.jpa.jpa_part_two.model.JVM3;
import com.jpa.jpa_part_two.model.QA3;
import com.jpa.jpa_part_two.model.Trainee3;
import com.jpa.jpa_part_two.service.TableWithClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tpc")
public class TableWithClass {
    @Autowired
    TableWithClassService service;
    @PostMapping("/jvm")
    void CreateJVM(@RequestBody JVM3 j)
    {
        service.createJVM(j);
    }
    @PostMapping("/qa")
    void CreateQA(@RequestBody QA3 j)
    {
        service.createQA(j);
    }
    @GetMapping("/get")
    List<Trainee3> get()
    {
        return service.get();
    }
}
