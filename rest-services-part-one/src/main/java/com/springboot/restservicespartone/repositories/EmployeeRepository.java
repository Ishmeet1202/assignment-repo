package com.springboot.restservicespartone.repositories;

import com.springboot.restservicespartone.models.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeRepository {
    private static List<Employee> employees = new ArrayList<>();
    private static Integer count = 0;

    static {
        employees.add(new Employee(++count, "Dushi", 23));
        employees.add(new Employee(++count, "Shashwat", 22));
        employees.add(new Employee(++count, "Rahul", 22));
    }

    public void save(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> findAll() {
        System.out.println(employees);;
        return employees;
    }

    public Optional<Employee> findById(Integer id) {
        return employees.stream().filter(employee -> employee.getId().equals(id)).findFirst();
    }

    public void deleteById(Integer id) {
        employees.removeIf(employee -> employee.getId().equals(id));
    }

    public void updateById(Integer id, Employee employee) {
        Employee employeeToBeUpdated = findById(id).get();
        employeeToBeUpdated.setName(employee.getName());
        employeeToBeUpdated.setAge(employee.getAge());

        save(employeeToBeUpdated);
    }

}
