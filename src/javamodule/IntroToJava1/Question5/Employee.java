package javamodule.IntroToJava1.Question5;

// QUESTION 5

public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private String designation;

    public Employee(String firstName) {
        setFirstName(firstName);
    }

    public Employee(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    public Employee(String firstName, String lastName, int age) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
    }

    public Employee(String firstName, String lastName, int age, String designation) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setDesignation(designation);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("Firstname cannot be null or empty.");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("Lastname cannot be null or empty.");
        }
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be negative or zero.");
        }
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        if (designation == null || designation.isBlank()) {
            throw new IllegalArgumentException("Designation cannot be null or empty.");
        }
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Name: "+firstName+" "+lastName+"\n"+"Age: "+age+"\n"+"Designation: "+designation;
    }

    public static void main(String[] args) {
        try {
            Employee emp = new Employee("Ishmeet","Singh",-23,"Software Engineer");
            System.out.println(emp);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
