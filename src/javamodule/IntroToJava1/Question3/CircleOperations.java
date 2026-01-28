package javamodule.IntroToJava1.Question3;

import java.util.Scanner;

// QUESTION 3

public class CircleOperations {

    private static double areaOfCircle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }

        return Math.PI * radius * radius;
    }

    private static double circumferenceOfCircle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }

        return 2 * Math.PI * radius;
    }

    private static double readRadius(Scanner sc) {
        System.out.print("Enter the value of radius: ");
        return sc.nextDouble();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("""
                \n
                ******Menu******
                1. Calculate Area of the Circle
                2. Calculate Circumference of a Circle
                3. Exit
                """);

            System.out.print("Choose an option(1-3): ");

            int choice = sc.nextInt();

            if (choice == 3) {
                System.out.println("Exited !");
                break;
            }

            double radius;

            try {
                switch (choice) {
                    case 1 -> {
                        radius = readRadius(sc);
                        double area = areaOfCircle(radius);
                        System.out.println("Area of the circle is: "+area+" m^2");
                    }
                    case 2 -> {
                        radius = readRadius(sc);
                        double circumference = circumferenceOfCircle(radius);
                        System.out.println("Circumference of the circle is: "+circumference+" m");
                    }
                    default -> System.out.println("You have entered the wrong choice ! Please try again.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("----------------------------------------------------------------------------------------");
        }
    }
}
