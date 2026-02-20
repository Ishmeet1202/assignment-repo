package com.jpa.jpa_part_two.service;

import com.jpa.jpa_part_two.model.*;
import com.jpa.jpa_part_two.model.JVM2;
import com.jpa.jpa_part_two.model.QA2;
import com.jpa.jpa_part_two.model.Trainee2;
import com.jpa.jpa_part_two.repository.JoinedTraineeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JoinedInheritanceService
{
    @Autowired
    JoinedTraineeRepo repo;
    public void createJVM(JVM2 jvm)
    {
        repo.save(jvm);
    }
    public void createQA(QA2 qa)
    {
        repo.save(qa);
    }
    public List<Trainee2> get()
    {
        return  repo.findAll();
    }
}
