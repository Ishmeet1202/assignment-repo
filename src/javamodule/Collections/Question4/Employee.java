package javamodule.Collections.Question4;

import java.util.Objects;

public class Employee {
    private String name;
    private Integer age;
    private String designation;

    public Employee(String name, Integer age, String designation) {
        setName(name);
        setAge(age);
        setDesignation(designation);
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Name cannot be empty or null");
        this.name = name;
    }

    public void setAge(Integer age) {
        if (age <= 0) throw new IllegalArgumentException("Age cannot be negative or zero");
        this.age = age;
    }

    public void setDesignation(String designation) {
        if (designation == null || designation.isBlank()) throw new IllegalArgumentException("Designation cannot be empty or null");
        this.designation = designation;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(age, employee.age) && Objects.equals(designation, employee.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, designation);
    }

    @Override
    public String toString() {
        return "{ Name: "+name+", Age: "+age+", Designation: "+designation+" }";
    }
}
