package com.jpa.jpa_part_one.services;

import com.jpa.jpa_part_one.models.Employee;
import com.jpa.jpa_part_one.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServices {
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServices(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee update(Integer id, Employee employee) {
        Optional<Employee> optional = employeeRepository.findById(id);
        Employee oldEmployee = optional.get();
        oldEmployee.setName(employee.getName());
        oldEmployee.setAge(employee.getAge());
        oldEmployee.setLocation(employee.getLocation());
        return employeeRepository.save(oldEmployee);
    }

    public void delete(Integer id) {
        Optional<Employee> optional = employeeRepository.findById(id);
        if (optional.isPresent()) {
            employeeRepository.deleteById(id);
        }
    }

    public Employee getEmployee(Integer id) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        return optionalEmployee.get();
    }

    public List<Employee> getALlEmployees(Integer pageNo, Integer pageSize) {
        Sort sort = Sort.by(Sort.Direction.ASC, "age");
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
        return employeeRepository.findAll(pageable).getContent();
    }

    public Long countOfEmployees() {
        return employeeRepository.count();
    }

    public List<Employee> getEmployeesByName(String name) {
        return employeeRepository.findByName(name);
    }

    public List<Employee> getEmployeesByStartingChar(String ch) {
        return employeeRepository.findByNameStartingWith(ch);
    }

    public List<Employee> getEmployeesByAgeRange(Integer start, Integer end) {
        return employeeRepository.findByAgeBetween(start, end);
    }
}
