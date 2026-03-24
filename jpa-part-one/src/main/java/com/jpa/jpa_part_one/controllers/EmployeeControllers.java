package com.jpa.jpa_part_one.controllers;

import com.jpa.jpa_part_one.models.Employee;
import com.jpa.jpa_part_one.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeControllers {
    private EmployeeServices employeeServices;

    @Autowired
    public EmployeeControllers(EmployeeServices employeeServices) {
        this.employeeServices = employeeServices;
    }

    @PostMapping("/")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        Employee savedEmployee = employeeServices.save(employee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee, @PathVariable Integer id) {
        Employee savedEmployee = employeeServices.update(id, employee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Integer id) {
        employeeServices.delete(id);
        return new ResponseEntity<>("Employee deleted successfully", HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable Integer id) {
        Employee employee = employeeServices.getEmployee(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<Employee>> getEmployeeByPage(@RequestParam Integer pageNo, @RequestParam Integer pageSize) {
        List<Employee> employees = employeeServices.getEmployeesByPage(pageNo, pageSize);
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/count")
    public ResponseEntity<Long> getEmployeesCount() {
        Long employeeCount = employeeServices.countOfEmployees();
        return new ResponseEntity<>(employeeCount, HttpStatus.OK);
    }

    @GetMapping("/name/{name}")
    public List<Employee> byName(@PathVariable String name){
        return employeeServices.getEmployeesByName(name);
    }

    @GetMapping("/starts/{ch}")
    public List<Employee> starts(@PathVariable String ch){
        return employeeServices.getEmployeesByStartingChar(ch);
    }

    @GetMapping("/between/")
    public List<Employee> between(@RequestParam Integer start, @RequestParam Integer end){
        return employeeServices.getEmployeesByAgeRange(start, end);
    }
}
