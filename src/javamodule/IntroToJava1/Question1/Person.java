package javamodule.IntroToJava1.Question1;

// QUESTION 1
public class Person {

    static String firstName = "Ishmeet";
    static String lastName = "Singh";
    static int age = 23;

    static {
        System.out.println("Static Block: ");
        System.out.println("First Name (from static block): " + firstName);
        System.out.println("Last Name (from static block): " + lastName);
        System.out.println("Age (from static block): " + age);
    }

    static void printPerson() {
        System.out.println("\nStatic Method");
        System.out.println("First Name (from static method): " + firstName);
        System.out.println("Last Name (from static method): " + lastName);
        System.out.println("Age (from static method): " + age);
    }

    public static void main(String[] args) {

        System.out.println("\nStatic Variable");
        System.out.println("First Name (from static variable): " + firstName);
        System.out.println("Last Name (from static variable): " + lastName);
        System.out.println("Age (from static variable): " + age);
        printPerson();
    }
}
