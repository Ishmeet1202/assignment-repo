package com.jpa.jpa_part_two.service;

import com.jpa.jpa_part_two.model.JVM;
import com.jpa.jpa_part_two.model.QA;
import com.jpa.jpa_part_two.repository.SingleTraineeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SingledInheritanceService {
    @Autowired
    SingleTraineeRepo repo;
    public void createJVM(JVM jvm)
    {
        repo.save(jvm);
    }
    public void createQA(QA qa)
    {
        repo.save(qa);
    }
}
