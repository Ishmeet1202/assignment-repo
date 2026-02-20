package com.jpa.jpa_part_two.controller;

import com.jpa.jpa_part_two.model.JVM;
import com.jpa.jpa_part_two.model.QA;
import com.jpa.jpa_part_two.service.SingledInheritanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/single")
public class SingledInheritance {
    @Autowired
    SingledInheritanceService service;
    @PostMapping("/jvm")
    void CreateJVM(@RequestBody JVM j)
    {
        service.createJVM(j);
    }
    @PostMapping("/qa")
    void CreateQA(@RequestBody QA j)
    {
        service.createQA(j);
    }

}
