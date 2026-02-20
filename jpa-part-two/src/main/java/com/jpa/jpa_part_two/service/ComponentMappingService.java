package com.jpa.jpa_part_two.service;

import com.jpa.jpa_part_two.model.Worker;
import com.jpa.jpa_part_two.repository.WorkerEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComponentMappingService {
    @Autowired
    WorkerEmployee repo;
    public void create(Worker m)
    {
        repo.save(m);
    }
    public List<Worker> getALL()
    {
        return repo.findAll();
    }
}
