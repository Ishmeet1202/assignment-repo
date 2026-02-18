package com.jpa.jpa_part_one.repositories;

import com.jpa.jpa_part_one.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    List<Employee> findByName(String name);

    List<Employee> findByNameStartingWith(String prefix);

    List<Employee> findByAgeBetween(Integer start, Integer end);
}
