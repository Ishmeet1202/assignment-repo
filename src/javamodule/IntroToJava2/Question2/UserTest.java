package javamodule.IntroToJava2.Question2;

// QUESTION 2

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/ishmeet-singh/users.txt", true))) {
            Scanner sc = new Scanner(System.in);
            String option;

            while (true) {
                System.out.print("Do you want to continue creating users ? (Type QUIT to exit): ");
                option = sc.next();

                if (option.equals("QUIT")) {
                    System.out.println("QUITING.. !");
                    break;
                }

                System.out.print("Enter the user first name: ");
                String firstName = sc.next();

                System.out.print("Enter the user last name: ");
                String lastName = sc.next();

                System.out.print("Enter the user age: ");
                int age = sc.nextInt();

                System.out.print("Enter the user phone no: ");
                String phoneNo = sc.next();

                User user = new User(firstName, lastName, age, phoneNo);

                String userDetails = user.toString();

                bw.write(userDetails);
                bw.flush();

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
