package javamodule.Java8.Question9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Rahul Kumar Singh", 4000L, "delhi"),
                new Employee("Amit Kumar Verma", 4500L, "delhi"),
                new Employee("Rahul Kumar Mehta", 3000L, "delhi"),
                new Employee("Neha Kumar Sharma", 6000L, "delhi"),
                new Employee("Amit Kumar Jain", 3500L, "mumbai")
        );

        List<String> firstNames = employees.stream().filter(e -> e.salary < 5000)
                .filter(e -> "delhi".equalsIgnoreCase(e.city))
                .map(e -> e.fullName.split(" ")[0])
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Unique first name of employees having salary less than 5000: " + firstNames);

    }
}
