package javamodule.Collections.Question2;

public class Employee implements Comparable<Employee> {
    private Double age;
    private Double salary;
    private String name;

    public Employee(double age, double salary, String name) {
        setName(name);
        setSalary(salary);
        setAge(age);
    }

    public void setAge(Double age) {
        if (age <= 0) throw new IllegalArgumentException("Age cannot be negative or zero");
        this.age = age;
    }

    public void setSalary(Double salary) {
        if (age <= 0) throw new IllegalArgumentException("Salary cannot be negative or zero");
        this.salary = salary;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Name cannot be empty or null");
        this.name = name;
    }

    public Double getAge() {
        return age;
    }

    public Double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Employee other) {
        String[] thisName = name.split(" ");
        String[] otherName = other.name.split(" ");

        int firstNameCheck = thisName[0].compareTo(otherName[0]);

        if (firstNameCheck == 0) {
            return thisName[1].compareTo(otherName[1]);
        }

        return firstNameCheck;
    }

    @Override
    public String toString() {
        return "{ Name: "+name+", Age: "+age+", Salary: "+salary+" }";
    }
}
