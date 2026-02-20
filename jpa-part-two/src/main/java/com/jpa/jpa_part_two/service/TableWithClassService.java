package com.jpa.jpa_part_two.service;

import com.jpa.jpa_part_two.model.*;
import com.jpa.jpa_part_two.model.JVM3;
import com.jpa.jpa_part_two.model.QA3;
import com.jpa.jpa_part_two.model.Trainee3;
import com.jpa.jpa_part_two.repository.TableWithClassRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableWithClassService {
    @Autowired
    TableWithClassRepo repo;
    public void createJVM(JVM3 jvm)
    {
        repo.save(jvm);
    }
    public void createQA(QA3 qa)
    {
        repo.save(qa);
    }
    public List<Trainee3> get()
    {
        return  repo.findAll();
    }
}
