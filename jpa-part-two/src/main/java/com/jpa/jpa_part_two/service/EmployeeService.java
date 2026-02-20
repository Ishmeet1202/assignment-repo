package com.jpa.jpa_part_two.service;

import com.jpa.jpa_part_two.repository.EmployeeRepository;
import com.jpa.jpa_part_two.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository repository;
    
    public void create(Employee e)
    {
        repository.save(e);
    }

    public List<Employee> getAll()
    {
        return repository.findAll();
    }
    public ResponseEntity<?> Q1_1()
    {
        return ResponseEntity.ok(repository.getEmployeesAboveAvg());
    }
    @Transactional
    public void Q1_2() {
        double avg = repository.getAvgSalary();
        repository.updateBelowAvg(100000, avg);
    }
    @Transactional
    public double Q1_3() {
        double min = repository.dsalary();
        repository.deleteMin(min);
        return min;
    }
    public Employee Q2_1() {
        return repository.lastName("Singh");
    }
    public int Q2_2() {
         return repository.deleteAfterAge(40);
    }


}
