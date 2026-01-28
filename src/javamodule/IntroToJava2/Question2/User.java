package javamodule.IntroToJava2.Question2;

// QUESTION 2
public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNo;

    public User(String firstName, String lastName, int age, String phoneNo) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setPhoneNo(phoneNo);
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isBlank()) throw new IllegalArgumentException("First name cannot be empty or null");
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.isBlank()) throw new IllegalArgumentException("Last name cannot be empty or null");
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age <= 0) throw new IllegalArgumentException("Age cannot be negative or zero");
        this.age = age;
    }

    public void setPhoneNo(String phoneNo) {
        if (phoneNo.length() != 10) throw new IllegalArgumentException("Phone no has less or more than 10 digits");
        this.phoneNo = phoneNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phoneNo='" + phoneNo + '\'' +
                '}'+"\n";
    }
}
