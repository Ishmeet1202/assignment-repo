package javamodule.IntroToJava1.Question2;

import java.util.Scanner;

// QUESTION 2

public class UserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        System.out.print("Enter the text: ");

        while (true) {

            String text = sc.nextLine();

            if (text.equals("XDONE")) {
                break;
            }

            sb.append(text).append("\n");
        }

        System.out.println("\nUser entered: ");
        System.out.println(sb);
    }
}