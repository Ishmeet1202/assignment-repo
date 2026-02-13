package com.springboot.restservicespartone.controllers;

import com.springboot.restservicespartone.models.Employee;
import com.springboot.restservicespartone.services.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> retrieveAllEmployees() {
        return employeeService.retrieveAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee retrieveOneEmployees(@PathVariable Integer id) {
        return employeeService.retrieveOneEmployee(id);
    }

    @PostMapping("/employees")
    public void createUser(@Valid @RequestBody Employee employee) {
        employeeService.createUser(employee);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteUser(@PathVariable Integer id) {
        employeeService.deleteUser(id);
    }

    @PutMapping("/employees/{id}")
    public void updateUser(@PathVariable Integer id, @Valid @RequestBody Employee employee) {
        employeeService.updateUser(id, employee);
    }
}
