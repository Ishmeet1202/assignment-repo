package com.springboot.restservicespartone.services;

import com.springboot.restservicespartone.exception.EmployeeNotFoundException;
import com.springboot.restservicespartone.models.Employee;
import com.springboot.restservicespartone.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> retrieveAllEmployees() {
        return employeeRepository.findAll();
    }

    public void createUser(Employee employee) {
        employeeRepository.save(employee);
    }

    public Employee retrieveOneEmployee(Integer id) {
        Optional<Employee> employee = employeeRepository.findById(id);

        if (employee.isEmpty()) {
            throw new EmployeeNotFoundException("Employee with this id: "+id+" does not exists.");
        }

        return employee.get();
    }

    public void deleteUser(Integer id) {

        if (employeeRepository.findById(id).isEmpty()) {
            throw new EmployeeNotFoundException("Employee with this id: "+id+" does not exists.");
        }

        employeeRepository.deleteById(id);
    }

    public void updateUser(Integer id, Employee employee) {

        if (employeeRepository.findById(id).isEmpty()) {
            throw new EmployeeNotFoundException("Employee with this id: "+id+" does not exists.");
        }

        employeeRepository.updateById(id, employee);
    }
}
