package javamodule.Java8.Question7;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

        int sumGreaterThanFive = list.stream().filter(e -> e > 5).mapToInt(e -> e).sum();

        System.out.println("Sum of elements greater than 5 in the list: " + sumGreaterThanFive);
    }
}