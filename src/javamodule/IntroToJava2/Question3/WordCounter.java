package javamodule.IntroToJava2.Question3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the file path: ");
        String filepath = inputScanner.next();

        System.out.print("Enter the word: ");
        String targetWord = inputScanner.next();

        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            int wordCount = 0;

            String x;

            while ((x = br.readLine()) != null) {
                String[] words = x.split("\\s+");
//                System.out.println(Arrays.toString(words));

                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        wordCount++;
                    }
                }
            }

            System.out.println(targetWord+" has a frequency of "+wordCount);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
