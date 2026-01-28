package javamodule.practice.PayrollSystem;

abstract public class Employee {
    private static int idInitializer = 0;
    private int id;
    private String name;

    public Employee(String name) {
        this.id = ++idInitializer;
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    abstract public int calculateSalary();
}
