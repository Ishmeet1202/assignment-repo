package javamodule.Collections.Question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(23, 35000,"Rahul Sharma");
        Employee e2 = new Employee(25, 40000,"Sagar Gupta");
        Employee e3 = new Employee(33, 70000,"Anuj Verma");
        Employee e4 = new Employee(30, 55000,"Rahul Chaudhary");

        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        System.out.println("\nEmployee List before natural order sorting: ");
        System.out.println(list);

        Collections.sort(list);

        System.out.println("\nEmployee List after natural order sorting: ");
        System.out.println(list);

        // SORTING BASIS ON SALARY

        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return emp1.getSalary().compareTo(emp2.getSalary());
            }
        });

        System.out.println("\nEmployee List after sorting on salary: ");
        System.out.println(list);
    }
}
